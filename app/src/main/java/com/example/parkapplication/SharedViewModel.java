package com.example.parkapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.parkapplication.model.User_Information;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<User_Information> updatedUser = new MutableLiveData<>();
    public void setUpdatedUser(User_Information user_information){
        updatedUser.setValue(user_information);
    }
    public LiveData<User_Information> getUpdatedUser(){
        return updatedUser;
    }
}
