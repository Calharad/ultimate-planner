package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Semestery implements Entity {

    public static final String _TABLE = "semestery";

    public static final String _ID = "id_semestery";

    public static final String _FIELD_OF_STUDY_ID = "field_of_study_id_field_of_study";

    public static final String _SEM_NUM = "sem_number";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int fieldOfStudyId;

    private int semNumber;

    private Date beginDate;

    private Date endDate;
}
