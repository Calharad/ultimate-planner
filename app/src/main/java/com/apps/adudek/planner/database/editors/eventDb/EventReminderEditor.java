package com.apps.adudek.planner.database.editors.eventDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.eventDb.EventReminder;
import com.apps.adudek.planner.others.DateConverter;

public class EventReminderEditor extends EntityEditor<EventReminder> {

    public EventReminderEditor(EventReminder entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(EventReminder._REMIND_DATE);
        if(index >=0)
        {
            entity.setRemindDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(EventReminder._DESC);
        if(index >=0)
        {
            entity.setDescription(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setDescription(null);

    }
}
