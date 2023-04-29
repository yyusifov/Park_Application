package com.example.parkapplication.javainuse;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private String id;
    private String url;
    private String fullName;
    private String parkCode;
    private String description;
    private String latitude;
    private String longitude;
    private String latLong;
    private List<Activity> activities = new ArrayList<Activity>();
    private List<Topic> topics = new ArrayList<Topic>();
    private String states;
    private Contacts contacts;
    private List<EntranceFee> entranceFees = new ArrayList<EntranceFee>();
    private List<Object> entrancePasses = new ArrayList<Object>();
    private List<Object> fees = new ArrayList<Object>();
    private String directionsInfo;
    private String directionsUrl;
    private List<OperatingHour> operatingHours = new ArrayList<OperatingHour>();
    private List<Address> addresses = new ArrayList<Address>();
    private List<Image> images = new ArrayList<Image>();
    private String weatherInfo;
    private String name;
    private String designation;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getParkCode() {
        return parkCode;
    }
    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatLong() {
        return latLong;
    }
    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }
    public List<Activity> getActivities() {
        return activities;
    }
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
    public List<Topic> getTopics() {
        return topics;
    }
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
    public String getStates() {
        return states;
    }
    public void setStates(String states) {
        this.states = states;
    }
    public Contacts getContacts() {
        return contacts;
    }
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }
    public List<EntranceFee> getEntranceFees() {
        return entranceFees;
    }
    public void setEntranceFees(List<EntranceFee> entranceFees) {
        this.entranceFees = entranceFees;
    }
    public List<Object> getEntrancePasses() {
        return entrancePasses;
    }
    public void setEntrancePasses(List<Object> entrancePasses) {
        this.entrancePasses = entrancePasses;
    }
    public List<Object> getFees() {
        return fees;
    }
    public void setFees(List<Object> fees) {
        this.fees = fees;
    }
    public String getDirectionsInfo() {
        return directionsInfo;
    }
    public void setDirectionsInfo(String directionsInfo) {
        this.directionsInfo = directionsInfo;
    }
    public String getDirectionsUrl() {
        return directionsUrl;
    }
    public void setDirectionsUrl(String directionsUrl) {
        this.directionsUrl = directionsUrl;
    }
    public List<OperatingHour> getOperatingHours() {
        return operatingHours;
    }
    public void setOperatingHours(List<OperatingHour> operatingHours) {
        this.operatingHours = operatingHours;
    }
    public List<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public List<Image> getImages() {
        return images;
    }
    public void setImages(List<Image> images) {
        this.images = images;
    }
    public String getWeatherInfo() {
        return weatherInfo;
    }
    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}