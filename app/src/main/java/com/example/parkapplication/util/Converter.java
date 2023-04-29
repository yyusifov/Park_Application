package com.example.parkapplication.util;

import androidx.room.TypeConverter;

import java.util.Date;

public class Converter {
    @TypeConverter
    public static Long fromDateToLong(Date date){
        if(date == null){
            return null;
        }
        else{
            return date.getTime();
        }
    }
    @TypeConverter
    public static Date fromLongToDate(Long dateNumber){
        if(dateNumber == null){
            return null;
        }
        else{
            return new Date(dateNumber);
        }
    }
}
