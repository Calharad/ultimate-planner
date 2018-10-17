package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class FieldOfStudy implements Entity {

    public static final String _TABLE = "field_of_study";

    public static final String _ID = "id_field_of_study";

    public static final String _NAME = "name";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    private int id;

    private String name;
}
