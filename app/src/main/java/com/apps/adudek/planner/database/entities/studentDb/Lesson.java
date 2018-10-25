package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.ChildArray;
import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class Lesson implements Entity {

    public static final String _TABLE = "lesson";

    public static final String _ID = "id_lesson";

    public static final String _MODULE_ID = "module_id_module";

    public static final String _B_DATE = "begin_date";

    public static final String _E_DATE = "end_date";

    public static final String _NOTE = "note";

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getNote() {
        return note;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ChildArray<Aborted> getAbortedChildren() {
        return abortedChildren;
    }

    private Date beginDate;

    private Date endDate;

    private String note;

    private ChildArray<Aborted> abortedChildren = new ChildArray<>();
}
