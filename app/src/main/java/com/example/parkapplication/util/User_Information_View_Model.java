package com.example.parkapplication.util;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.parkapplication.data.UIRepository;
import com.example.parkapplication.model.User_Information;

import java.util.List;

public class User_Information_View_Model extends AndroidViewModel {
    private static UIRepository uiRepository;
    private LiveData<List<User_Information>> allInformation;
    public User_Information_View_Model(@NonNull Application application) {
        super(application);
        uiRepository = new UIRepository(application);
        allInformation = uiRepository.getGetAllData();
    }
    public LiveData<List<User_Information>> getAllUserInformation(){
        return uiRepository.getGetAllData();
    }
    public LiveData<User_Information> get(long id){
        return uiRepository.get(id);
    }
    public static void update(User_Information user_information){
        uiRepository.update(user_information);
    }
    public static void delete(User_Information user_information){
        uiRepository.delete(user_information);
    }
    public static void insert(User_Information user_information){
        uiRepository.insert(user_information);
    }
    public static void deleteAll(){
        uiRepository.deleteAll();
    }
}
