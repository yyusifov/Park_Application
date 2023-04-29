package com.example.parkapplication.javainuse;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class ViewModelPark extends ViewModel {
    public LiveData<List<Root>> getParks() {
        return parks;
    }
    public void setParks(List<Root> parkList){
        parks.setValue(parkList);
    }
    public LiveData<Root> getPark() {
        return park;
    }
    public void setPark(Root root){
        park.setValue(root);
    }
    private MutableLiveData<Root> park = new MutableLiveData<>();
    private MutableLiveData<List<Root>> parks = new MutableLiveData<>();
}
