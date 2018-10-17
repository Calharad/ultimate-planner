package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Lesson implements Entity {

    public static final String _TABLE = "lesson";

    public static final String _ID = "id_lesson";

    public static final String _SUBJECT_ID = "subject_id_subject";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public static final String _NOTE = "note";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int subjectId;

    private Date beginDate;

    private Date endDate;

    private String note;
}
