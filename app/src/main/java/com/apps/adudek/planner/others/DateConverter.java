package com.apps.adudek.planner.others;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateConverted - static class used to convert between Date and String object
 */
public class DateConverter {

    /**
     * DEFAULT_FORMAT, HOUR_FORMAT
     *
     * Contains types of used Date formats
     */
    public static final String DEFAULT_FORMAT = "yyyy-mm-dd' 'hh:mm";

    public static final String HOUR_FORMAT = "hh:mm";

    /**
     * fromStringToDate - converts String to a Date object
     *
     * @param input - entry String, which'll be converted into Date
     * @param format - format of input String, allows converter to know, how to convert
     * @return - returns converted Date if no error, otherwise returns null
     */
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

    /**
     * fromDateToString - converts Date object to a String
     *
     * @param input - entry Date, which'll be converted into String
     * @param format - format for output String, allows converter to know, how to convert
     * @return - returns converted String if no error, otherwise returns null
     */
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
