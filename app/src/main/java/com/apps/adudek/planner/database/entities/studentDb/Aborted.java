package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Aborted implements Entity {

    public static final String _TABLE = "aborted";

    public static final String _ID = "id_aborted";

    public static final String _LESSON_ID = "lesson_id_lesson";

    public static final String _DESC = "description";

    public static final String _NEW_B_DATE = "new_begin_date";

    public static final String _NEW_E_DATE = "new_end_date";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData
    }

    //TODO: getter/setter

    private int id;

    private int lessonId;

    private String description;

    private Date newBeginDate;

    private Date newEndDate;
}
