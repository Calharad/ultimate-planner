package com.apps.adudek.planner.database.entities.noteDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Note implements Entity {

    public static final String _TABLE = "note";

    public static final String _ID = "id_note";

    public static final String _TITLE = "title";

    public static final String _DESC = "description";

    public static final String _DATE = "\"date\"";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private String title;

    private String description;

    private Date date;
}
