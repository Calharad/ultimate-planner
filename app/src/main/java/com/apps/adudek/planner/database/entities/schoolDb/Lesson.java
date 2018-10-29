package com.apps.adudek.planner.database.entities.schoolDb;

import android.support.annotation.Nullable;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Lesson implements Entity {

    public static final String _TABLE = "lesson";

    public static final String _ID = "id_lesson";

    public static final String _SUBJECT_ID = "subject_id_subject";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public static final String _NOTE = "note";

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setNote(@Nullable String note) {
        this.note = note;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getNote() {
        return note;
    }

    private Date beginDate;

    private Date endDate;

    private String note;

}
