package com.apps.adudek.planner.database.editors;

import android.database.Cursor;

import com.apps.adudek.planner.database.entities.Entity;

public abstract class EntityEditor <T extends Entity>{

    public EntityEditor(T entity)
    {
        this.entity = entity;
    }

    public void setFullData(Cursor cursor)
    {
        setMissingData(cursor);
        setPartData(cursor);
    }

    public abstract void setPartData(Cursor cursor);

    public abstract void setMissingData(Cursor cursor);

    public abstract void clearUselessData();

    protected T entity;

}
