package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public class Subject implements Entity {

    public static final String _TABLE = "subject";

    public static final String _ID = "id_subject";

    public static final String _SEM_ID = "semestery_id_semestery";

    public static final String _NAME = "name";

    public static final String _PRIORITY = "priority";

    public static final String _GRADE = "final_grade";

    public static final String _MANDATORY = "mandatory";

    @Override
    public void setData(Cursor cursor) {
    //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int semesteryId;

    private String name;

    private int priority;

    private String finalGrade;

    private boolean mandatory;
}
