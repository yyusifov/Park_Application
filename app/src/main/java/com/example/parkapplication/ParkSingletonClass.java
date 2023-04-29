package com.example.parkapplication;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class ParkSingletonClass extends Application {

    private static ParkSingletonClass parkSingletonClass;
    private RequestQueue requestQueue;

    public synchronized static ParkSingletonClass getParkSingletonClass(){
        return parkSingletonClass;
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue == null){
            requestQueue =  Volley.newRequestQueue(getApplicationContext());
        }
        return requestQueue;
    }
    public <T> void addToRequestQueue(Request<T> request){
        getRequestQueue().add(request);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if(parkSingletonClass == null){
            parkSingletonClass = this;
        }
    }
}
