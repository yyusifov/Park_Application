package com.example.parkapplication.repository;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.parkapplication.ParkSingletonClass;
import com.example.parkapplication.javainuse.Activity;
import com.example.parkapplication.javainuse.Image;
import com.example.parkapplication.javainuse.OperatingHour;
import com.example.parkapplication.javainuse.Root;
import com.example.parkapplication.javainuse.StandardHours;
import com.example.parkapplication.javainuse.Topic;
import com.example.parkapplication.util.Util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ParkRepository {
    private List<Root> allParks = new ArrayList<>();
    public void getParkList(SaveParkList parkList, String stateCode){
        String url = Util.getUrl(stateCode);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, response -> {
            try {
                JSONArray jsonArray = response.getJSONArray("data");
                for (int i = 0; i < jsonArray.length(); i++) {
                    Root root = new Root();
                    root.setLatitude(jsonArray.getJSONObject(i).getString("latitude"));
                    root.setLongitude(jsonArray.getJSONObject(i).getString("longitude"));
                    root.setFullName(jsonArray.getJSONObject(i).getString("fullName"));
                    root.setStates(jsonArray.getJSONObject(i).getString("states"));
                    root.setWeatherInfo(jsonArray.getJSONObject(i).getString("weatherInfo"));
                    root.setDescription(jsonArray.getJSONObject(i).getString("description"));
                    root.setDesignation(jsonArray.getJSONObject(i).getString("designation"));
                    JSONArray jsonArray1 = jsonArray.getJSONObject(i).getJSONArray("images");
                    List<Image> imageList = new ArrayList<>();
                    for (int j = 0; j < jsonArray1.length(); j++) {
                        Image image = new Image();
                        image.setUrl(jsonArray1.getJSONObject(j).getString("url"));
                        image.setTitle(jsonArray1.getJSONObject(j).getString("title"));
                        image.setAltText(jsonArray1.getJSONObject(j).getString("altText"));
                        image.setCaption(jsonArray1.getJSONObject(j).getString("caption"));
                        image.setCredit(jsonArray1.getJSONObject(j).getString("credit"));
                        imageList.add(image);
                    }
                    root.setImages(imageList);

                    List<Activity> activityList = new ArrayList<>();
                    JSONArray jsonArray3 = jsonArray.getJSONObject(i).getJSONArray("activities");
                    for (int j = 0; j < jsonArray3.length(); j++) {
                        Activity activity =  new Activity();
                        activity.setName(jsonArray3.getJSONObject(j).getString("name"));
                        activityList.add(activity);
                    }
                    root.setActivities(activityList);

                    List<Topic> topicList = new ArrayList<>();
                    JSONArray jsonArray4 = jsonArray.getJSONObject(i).getJSONArray("topics");
                    for (int j = 0; j < jsonArray4.length(); j++) {
                        Topic topic = new Topic();
                        topic.setName(jsonArray4.getJSONObject(j).getString("name"));
                        topicList.add(topic);
                    }
                    root.setTopics(topicList);

                    List<OperatingHour> operatingHoursList = new ArrayList<>();
                    JSONArray jsonArray2 = jsonArray.getJSONObject(i).getJSONArray("operatingHours");
                    for (int j = 0; j < jsonArray2.length(); j++) {
                        OperatingHour operatingHour = new OperatingHour();
                        StandardHours standardHours = new StandardHours();
                        standardHours.setMonday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("monday"));
                        standardHours.setThursday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("thursday"));
                        standardHours.setWednesday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("wednesday"));
                        standardHours.setTuesday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("tuesday"));
                        standardHours.setFriday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("friday"));
                        standardHours.setSaturday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("saturday"));
                        standardHours.setSunday(jsonArray2.getJSONObject(j).getJSONObject("standardHours").getString("sunday"));
                        operatingHour.setStandardHours(standardHours);
                        operatingHoursList.add(operatingHour);
                    }
                    root.setOperatingHours(operatingHoursList);
                    allParks.add(root);
                }
                parkList.saveParkList(allParks);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }, error -> {

        });
        ParkSingletonClass.getParkSingletonClass().addToRequestQueue(jsonObjectRequest);
    }

}
