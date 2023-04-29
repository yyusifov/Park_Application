package com.example.parkapplication.util;

public class Util {
    public static String getUrl(String stateCode){
     return "https://developer.nps.gov/api/v1/parks?stateCode=" + stateCode + "&api_key=DJg0LMnLfF691sgba0LPexQBAuv2gPXfBFp1j7xI";
    }
}
