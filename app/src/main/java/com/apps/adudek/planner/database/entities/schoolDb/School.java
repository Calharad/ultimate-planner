package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class School implements Entity {

    public static final String _TABLE = "school";

    public static final String _ID = "id_school";

    public static final String _NAME = "name";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData
    }

    //TODO:getter/setter + other

    private int id;

    private String name;
}
