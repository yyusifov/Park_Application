package com.example.parkapplication.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class User_Information {
    public User_Information() {
    }

    @ColumnInfo(name = "user_ID")
    @PrimaryKey(autoGenerate = true)
    private long userId;
    @ColumnInfo(name = "user_Name")
    private String userName;

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserReservation() {
        return UserReservation;
    }

    public void setUserReservation(String userReservation) {
        UserReservation = userReservation;
    }

    public String getReservedPark() {
        return reservedPark;
    }

    public void setReservedPark(String reservedPark) {
        this.reservedPark = reservedPark;
    }

    public String getReservedRestaurant() {
        return reservedRestaurant;
    }

    public void setReservedRestaurant(String reservedRestaurant) {
        this.reservedRestaurant = reservedRestaurant;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getReservedDate() {
        return reservedDate;
    }

    public void setReservedDate(Date reservedDate) {
        this.reservedDate = reservedDate;
    }

    public String getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(String amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    @ColumnInfo(name = "user_Reservation")
    private String UserReservation;
    @ColumnInfo(name = "reserved_Park")
    private String reservedPark;

    public User_Information(String userName, String userReservation, String reservedPark, String reservedRestaurant, Date reservationDate, Date reservedDate, String amountOfMoney, String userPassword) {
        this.userName = userName;
        UserReservation = userReservation;
        this.reservedPark = reservedPark;
        this.reservedRestaurant = reservedRestaurant;
        this.reservationDate = reservationDate;
        this.reservedDate = reservedDate;
        this.amountOfMoney = amountOfMoney;
        this.userPassword = userPassword;
    }
    @ColumnInfo(name = "reserved_Restaurant")
    private String reservedRestaurant;
    @ColumnInfo(name = "reservation_Date")
    private Date reservationDate;
    @ColumnInfo(name = "reserved_Date")
    private Date reservedDate;
    @ColumnInfo(name = "amount_Of_Time")
    private String amountOfMoney;
    @ColumnInfo(name = "user_Password")
    private String userPassword;
}
