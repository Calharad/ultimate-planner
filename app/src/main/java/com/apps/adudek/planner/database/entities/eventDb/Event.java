package com.apps.adudek.planner.database.entities.eventDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Event implements Entity {

    public static final String _TABLE = "event";

    public static final String _ID = "id_event";

    public static final String _TITLE = "title";

    public static final String _DESC = "description";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    @Override
    public void setData(Cursor cursor) {
    //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private String title;

    private String description;

    private Date begin_date;

    private Date end_date;
}
