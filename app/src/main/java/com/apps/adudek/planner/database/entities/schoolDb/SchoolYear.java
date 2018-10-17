package com.apps.adudek.planner.database.entities.schoolDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class SchoolYear implements Entity {

    public static final String _TABLE = "school_year";

    public static final String _ID = "id_school_year";

    public static final String _SCHOOL_ID = "school_id_school";

    public static final String _YEAR_NUM = "year_number";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public static final String _SEM_E_DATE = "semestery_end_date";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData
    }

    //TODO: getter/setter

    private int id;

    private int schoolId;

    private int yearNumber;

    private Date beginDate;

    private Date endDate;

    private Date semesteryEndDate;
}
