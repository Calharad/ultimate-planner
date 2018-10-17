package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class Grade implements Entity {

    public static final String _TABLE = "grade";

    public static final String _ID = "id_grade";

    public static final String _SUBJECT_ID = "module_id_module";

    public static final String _DESC = "description";

    public static final String _PRIORITY = "priority";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData
    }

    //TODO: getter/setter + other

    private int id;

    private int subjectId;

    private String description;

    private int priority;

}
