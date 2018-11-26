package com.apps.adudek.planner.database.editors.eventDb;

import android.database.Cursor;

import com.apps.adudek.planner.database.editors.EntityEditor;
import com.apps.adudek.planner.database.entities.eventDb.Event;
import com.apps.adudek.planner.others.DateConverter;

public class EventEditor extends EntityEditor<Event> {

    public EventEditor(Event entity) {
        super(entity);
    }

    @Override
    public void setPartData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Event._TITLE);
        if(index >=0)
        {
            entity.setTitle(cursor.getString(index));
        }

        index = cursor.getColumnIndex(Event._B_DATE);
        if(index >=0)
        {
            entity.setBeginDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

    }

    @Override
    public void setMissingData(Cursor cursor) {

        int index;

        index = cursor.getColumnIndex(Event._E_DATE);
        if(index >=0)
        {
            entity.setEndDate(DateConverter.fromStringToDate(cursor.getString(index),DateConverter.DEFAULT_FORMAT));
        }

        index = cursor.getColumnIndex(Event._DESC);
        if(index >=0)
        {
            entity.setDescription(cursor.getString(index));
        }

    }

    @Override
    public void clearUselessData() {

        entity.setEndDate(null);
        entity.setDescription(null);

    }
}
