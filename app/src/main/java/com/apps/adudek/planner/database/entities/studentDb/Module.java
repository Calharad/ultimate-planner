package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Module implements Entity {

    public static final String _TABLE = "\"module\"";

    public static final String _ID = "id_module";

    public static final String _SUBJECT_ID = "subject_id_subject";

    public static final String _MANDATORY = "mandatory";

    public static final String _GRADE = "final_grade";

    public static final String _WEEK_DAY = "week_day";

    public static final String _B_HOUR = "begin_hour";

    public static final String _E_HOUR = "end_hour";

    public static final String _FREQ = "frequency";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO:getter/setter + other

    private int id;

    private int subjectId;

    private boolean mandatory;

    public String final_grade;

    public int week_day;

    public Date begin_hour;

    public Date end_hour;

    public int frequency;
}
