package com.apps.adudek.planner.others;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    public static final String DEFAULT_FORMAT = "yyyy-mm-dd' 'hh:mm";

    public static final String HOUR_FORMAT = "hh:mm";

    public static Date fromStringToDate(String input, String format)
    {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        try {

            return dateFormat.parse(input);

        }catch(ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static String fromDateToString(Date input, String format)
    {
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        try {

            return dateFormat.format(input);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
