package com.mainacad.service;

import java.util.Date;

public class UserGenerationService {

    public static Date getDate(int year, int month, int day){
        Date date = new Date(year - 1900, month-1, day);
        return date;
    }

}
