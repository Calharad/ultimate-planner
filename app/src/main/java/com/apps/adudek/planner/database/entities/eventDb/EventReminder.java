package com.apps.adudek.planner.database.entities.eventDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

import java.util.Date;

public class EventReminder implements Entity {

    public static final String _TABLE = "event_reminder";

    public static final String _ID = "id_reminder";

    public static final String _EVENT_ID = "event_id_event";

    public static final String _REMIND_DATE = "remind_date";

    public static final String _DESC = "description";

    @Override
    public void setData(Cursor cursor) {
        //TODO: setData method
    }

    //TODO: getter/setter + other

    private int id;

    private int eventId;

    private Date remindDate;

    private String description;
}
