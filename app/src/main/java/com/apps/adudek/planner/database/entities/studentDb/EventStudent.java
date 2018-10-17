package com.apps.adudek.planner.database.entities.studentDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.eventDb.Event;

public class EventStudent extends Event {

    public static final String _SUBJECT_ID = "subject_id_subject";

    @Override
    public void setData(Cursor cursor) {
        super.setData(cursor);
        //TODO: setData method
    }

    private int subjectId;

}
