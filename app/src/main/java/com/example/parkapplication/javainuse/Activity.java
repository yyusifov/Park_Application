package com.example.parkapplication.javainuse;

public class Activity {
    private String id;
    private String name;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class Activity {
//    private String id;
//    private String name;
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class Address {
//    private String postalCode;
//    private String city;
//    private String stateCode;
//    private String line1;
//    private String type;
//    private String line3;
//    private String line2;
//    public String getPostalCode() {
//        return postalCode;
//    }
//    public void setPostalCode(String postalCode) {
//        this.postalCode = postalCode;
//    }
//    public String getCity() {
//        return city;
//    }
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public String getStateCode() {
//        return stateCode;
//    }
//    public void setStateCode(String stateCode) {
//        this.stateCode = stateCode;
//    }
//    public String getLine1() {
//        return line1;
//    }
//    public void setLine1(String line1) {
//        this.line1 = line1;
//    }
//    public String getType() {
//        return type;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }
//    public String getLine3() {
//        return line3;
//    }
//    public void setLine3(String line3) {
//        this.line3 = line3;
//    }
//    public String getLine2() {
//        return line2;
//    }
//    public void setLine2(String line2) {
//        this.line2 = line2;
//    }
//}
//package javainuse;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//public class Contacts {
//    private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
//    private List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
//    public List<PhoneNumber> getPhoneNumbers() {
//        return phoneNumbers;
//    }
//    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
//        this.phoneNumbers = phoneNumbers;
//    }
//    public List<EmailAddress> getEmailAddresses() {
//        return emailAddresses;
//    }
//    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
//        this.emailAddresses = emailAddresses;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class EmailAddress {
//    private String description;
//    private String emailAddress;
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class EntranceFee {
//    private String cost;
//    private String description;
//    private String title;
//    public String getCost() {
//        return cost;
//    }
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class Exception {
//    private ExceptionHours exceptionHours;
//    private String startDate;
//    private String name;
//    private String endDate;
//    public ExceptionHours getExceptionHours() {
//        return exceptionHours;
//    }
//    public void setExceptionHours(ExceptionHours exceptionHours) {
//        this.exceptionHours = exceptionHours;
//    }
//    public String getStartDate() {
//        return startDate;
//    }
//    public void setStartDate(String startDate) {
//        this.startDate = startDate;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getEndDate() {
//        return endDate;
//    }
//    public void setEndDate(String endDate) {
//        this.endDate = endDate;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class ExceptionHours {
//    private String wednesday;
//    private String monday;
//    private String thursday;
//    private String sunday;
//    private String tuesday;
//    private String friday;
//    private String saturday;
//    public String getWednesday() {
//        return wednesday;
//    }
//    public void setWednesday(String wednesday) {
//        this.wednesday = wednesday;
//    }
//    public String getMonday() {
//        return monday;
//    }
//    public void setMonday(String monday) {
//        this.monday = monday;
//    }
//    public String getThursday() {
//        return thursday;
//    }
//    public void setThursday(String thursday) {
//        this.thursday = thursday;
//    }
//    public String getSunday() {
//        return sunday;
//    }
//    public void setSunday(String sunday) {
//        this.sunday = sunday;
//    }
//    public String getTuesday() {
//        return tuesday;
//    }
//    public void setTuesday(String tuesday) {
//        this.tuesday = tuesday;
//    }
//    public String getFriday() {
//        return friday;
//    }
//    public void setFriday(String friday) {
//        this.friday = friday;
//    }
//    public String getSaturday() {
//        return saturday;
//    }
//    public void setSaturday(String saturday) {
//        this.saturday = saturday;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class Image {
//    private String credit;
//    private String title;
//    private String altText;
//    private String caption;
//    private String url;
//    public String getCredit() {
//        return credit;
//    }
//    public void setCredit(String credit) {
//        this.credit = credit;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public String getAltText() {
//        return altText;
//    }
//    public void setAltText(String altText) {
//        this.altText = altText;
//    }
//    public String getCaption() {
//        return caption;
//    }
//    public void setCaption(String caption) {
//        this.caption = caption;
//    }
//    public String getUrl() {
//        return url;
//    }
//    public void setUrl(String url) {
//        this.url = url;
//    }
//}
//package javainuse;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//public class OperatingHour {
//    private List<Exception> exceptions = new ArrayList<Exception>();
//    private String description;
//    private StandardHours standardHours;
//    private String name;
//    public List<Exception> getExceptions() {
//        return exceptions;
//    }
//    public void setExceptions(List<Exception> exceptions) {
//        this.exceptions = exceptions;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public StandardHours getStandardHours() {
//        return standardHours;
//    }
//    public void setStandardHours(StandardHours standardHours) {
//        this.standardHours = standardHours;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class PhoneNumber {
//    private String phoneNumber;
//    private String description;
//    private String extension;
//    private String type;
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public String getExtension() {
//        return extension;
//    }
//    public void setExtension(String extension) {
//        this.extension = extension;
//    }
//    public String getType() {
//        return type;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }
//}
//package javainuse;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//public class Root {
//    private String id;
//    private String url;
//    private String fullName;
//    private String parkCode;
//    private String description;
//    private String latitude;
//    private String longitude;
//    private String latLong;
//    private List<Activity> activities = new ArrayList<Activity>();
//    private List<Topic> topics = new ArrayList<Topic>();
//    private String states;
//    private Contacts contacts;
//    private List<EntranceFee> entranceFees = new ArrayList<EntranceFee>();
//    private List<Object> entrancePasses = new ArrayList<Object>();
//    private List<Object> fees = new ArrayList<Object>();
//    private String directionsInfo;
//    private String directionsUrl;
//    private List<OperatingHour> operatingHours = new ArrayList<OperatingHour>();
//    private List<Address> addresses = new ArrayList<Address>();
//    private List<Image> images = new ArrayList<Image>();
//    private String weatherInfo;
//    private String name;
//    private String designation;
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
//    public String getUrl() {
//        return url;
//    }
//    public void setUrl(String url) {
//        this.url = url;
//    }
//    public String getFullName() {
//        return fullName;
//    }
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//    public String getParkCode() {
//        return parkCode;
//    }
//    public void setParkCode(String parkCode) {
//        this.parkCode = parkCode;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public String getLatitude() {
//        return latitude;
//    }
//    public void setLatitude(String latitude) {
//        this.latitude = latitude;
//    }
//    public String getLongitude() {
//        return longitude;
//    }
//    public void setLongitude(String longitude) {
//        this.longitude = longitude;
//    }
//    public String getLatLong() {
//        return latLong;
//    }
//    public void setLatLong(String latLong) {
//        this.latLong = latLong;
//    }
//    public List<Activity> getActivities() {
//        return activities;
//    }
//    public void setActivities(List<Activity> activities) {
//        this.activities = activities;
//    }
//    public List<Topic> getTopics() {
//        return topics;
//    }
//    public void setTopics(List<Topic> topics) {
//        this.topics = topics;
//    }
//    public String getStates() {
//        return states;
//    }
//    public void setStates(String states) {
//        this.states = states;
//    }
//    public Contacts getContacts() {
//        return contacts;
//    }
//    public void setContacts(Contacts contacts) {
//        this.contacts = contacts;
//    }
//    public List<EntranceFee> getEntranceFees() {
//        return entranceFees;
//    }
//    public void setEntranceFees(List<EntranceFee> entranceFees) {
//        this.entranceFees = entranceFees;
//    }
//    public List<Object> getEntrancePasses() {
//        return entrancePasses;
//    }
//    public void setEntrancePasses(List<Object> entrancePasses) {
//        this.entrancePasses = entrancePasses;
//    }
//    public List<Object> getFees() {
//        return fees;
//    }
//    public void setFees(List<Object> fees) {
//        this.fees = fees;
//    }
//    public String getDirectionsInfo() {
//        return directionsInfo;
//    }
//    public void setDirectionsInfo(String directionsInfo) {
//        this.directionsInfo = directionsInfo;
//    }
//    public String getDirectionsUrl() {
//        return directionsUrl;
//    }
//    public void setDirectionsUrl(String directionsUrl) {
//        this.directionsUrl = directionsUrl;
//    }
//    public List<OperatingHour> getOperatingHours() {
//        return operatingHours;
//    }
//    public void setOperatingHours(List<OperatingHour> operatingHours) {
//        this.operatingHours = operatingHours;
//    }
//    public List<Address> getAddresses() {
//        return addresses;
//    }
//    public void setAddresses(List<Address> addresses) {
//        this.addresses = addresses;
//    }
//    public List<Image> getImages() {
//        return images;
//    }
//    public void setImages(List<Image> images) {
//        this.images = images;
//    }
//    public String getWeatherInfo() {
//        return weatherInfo;
//    }
//    public void setWeatherInfo(String weatherInfo) {
//        this.weatherInfo = weatherInfo;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getDesignation() {
//        return designation;
//    }
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class StandardHours {
//    private String wednesday;
//    private String monday;
//    private String thursday;
//    private String sunday;
//    private String tuesday;
//    private String friday;
//    private String saturday;
//    public String getWednesday() {
//        return wednesday;
//    }
//    public void setWednesday(String wednesday) {
//        this.wednesday = wednesday;
//    }
//    public String getMonday() {
//        return monday;
//    }
//    public void setMonday(String monday) {
//        this.monday = monday;
//    }
//    public String getThursday() {
//        return thursday;
//    }
//    public void setThursday(String thursday) {
//        this.thursday = thursday;
//    }
//    public String getSunday() {
//        return sunday;
//    }
//    public void setSunday(String sunday) {
//        this.sunday = sunday;
//    }
//    public String getTuesday() {
//        return tuesday;
//    }
//    public void setTuesday(String tuesday) {
//        this.tuesday = tuesday;
//    }
//    public String getFriday() {
//        return friday;
//    }
//    public void setFriday(String friday) {
//        this.friday = friday;
//    }
//    public String getSaturday() {
//        return saturday;
//    }
//    public void setSaturday(String saturday) {
//        this.saturday = saturday;
//    }
//}
//package javainuse;
//import java.util.HashMap;
//import java.util.Map;
//public class Topic {
//    private String id;
//    private String name;
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
