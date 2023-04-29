package com.example.parkapplication.util;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.parkapplication.data.User_InformationDAO;
import com.example.parkapplication.model.User_Information;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Database(entities = {User_Information.class}, version = 1, exportSchema = false)
@TypeConverters(value = {Converter.class})
public abstract class User_Information_DatabaseRoom extends RoomDatabase {
    private static volatile User_Information_DatabaseRoom user_information_databaseRoom;
    private int Number_OF_Threads = 4;
    public abstract User_InformationDAO user_informationDAO();
    public static ExecutorService executorService = Executors.newFixedThreadPool(4);
    public static User_Information_DatabaseRoom getUserInformationDatabaseRoom(Context context){
        if(user_information_databaseRoom == null) {
            synchronized (User_Information_DatabaseRoom.class) {
                user_information_databaseRoom = Room.databaseBuilder(context.getApplicationContext(),
                        User_Information_DatabaseRoom.class,
                        "User_Information_Database").addCallback(roomDatabaseCallback).build();
            }
        }
        return user_information_databaseRoom;
    }
    public static final RoomDatabase.Callback roomDatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            executorService.execute(() -> {
                User_InformationDAO user_informationDAO1 = user_information_databaseRoom.user_informationDAO();
                user_informationDAO1.deleteAll();
            });
        }
    };
}
