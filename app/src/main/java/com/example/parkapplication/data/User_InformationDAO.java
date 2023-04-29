package com.example.parkapplication.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.parkapplication.model.User_Information;

import java.util.List;

@Dao
public interface User_InformationDAO {
    @Insert
    void insert(User_Information user_information);
    @Delete
    void delete(User_Information user_information);
    @Update
    void update(User_Information user_information);
    @Query("Select * From User_Information")
    LiveData<List<User_Information>> getAll();
    @Query("Delete From User_Information")
    void deleteAll();
    @Query("Select * From User_Information Where User_Information.user_ID ==:user_ID")
    LiveData<User_Information> get(long user_ID);
}
