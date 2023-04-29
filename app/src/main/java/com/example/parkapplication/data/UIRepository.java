package com.example.parkapplication.data;

import android.app.Application;

import androidx.lifecycle.LiveData;


import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_DatabaseRoom;

import java.util.List;

public class UIRepository {
    private final User_InformationDAO user_informationDAO;
    private LiveData<List<User_Information>> getAllData;
    public UIRepository(Application application){
        User_Information_DatabaseRoom user_information_databaseRoom = User_Information_DatabaseRoom.
                getUserInformationDatabaseRoom(application);
        user_informationDAO = user_information_databaseRoom.user_informationDAO();
        getAllData = user_informationDAO.getAll();
    }
    public LiveData<List<User_Information>> getGetAllData(){
        return getAllData;
    }
    public LiveData<User_Information> get(long id){
        return user_informationDAO.get(id);
    }
    public void update(User_Information user_information){
        User_Information_DatabaseRoom.executorService.execute(() ->
                user_informationDAO.update(user_information));
    }
    public void insert(User_Information user_information){
        User_Information_DatabaseRoom.executorService.execute(() ->
                user_informationDAO.insert(user_information));
    }
    public void delete(User_Information user_information){
        User_Information_DatabaseRoom.executorService.execute(() ->
                user_informationDAO.delete(user_information));
    }
    public void deleteAll(){
        User_Information_DatabaseRoom.executorService.execute(() ->
                user_informationDAO.deleteAll());
    }
}

