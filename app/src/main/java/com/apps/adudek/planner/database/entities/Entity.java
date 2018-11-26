package com.apps.adudek.planner.database.entities;


import java.util.ArrayList;

/**
 * Interface used to set subclasses as a entities of a database
 */
public abstract class Entity {

    public Entity()
    {
        if(!isInitialized)
        {
            isInitialized = true;
            requiredColumns = new ArrayList<>();
            optionalColumns = new ArrayList<>();
            setOptionalColumns();
            setRequiredColumns();
        }
    }

    public ArrayList<String> getRequiredColumns() {
        return requiredColumns;
    }

    public static ArrayList<String> getOptionalColumns() {
        return optionalColumns;
    }

    public void set()

    protected abstract void setRequiredColumns();
    protected abstract void setOptionalColumns();

    private static ArrayList<String> requiredColumns;
    private static ArrayList<String> optionalColumns;
    private static boolean isInitialized = false;

}
