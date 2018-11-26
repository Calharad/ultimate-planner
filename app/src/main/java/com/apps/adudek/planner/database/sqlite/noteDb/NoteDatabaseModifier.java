package com.apps.adudek.planner.database.sqlite.noteDb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.apps.adudek.planner.database.entities.noteDb.Note;
import com.apps.adudek.planner.database.entities.noteDb.Photo;
import com.apps.adudek.planner.database.entities.noteDb.Text;
import com.apps.adudek.planner.database.entities.noteDb.ToDoElement;
import com.apps.adudek.planner.database.entities.noteDb.ToDoList;
import com.apps.adudek.planner.others.DateConverter;

import java.util.Date;
import java.util.HashMap;

public class NoteDatabaseModifier {

    public static long insert(Note entity, SQLiteDatabase db, ContentValues values)
    {
        if(values==null)
        {
            values = new ContentValues();
        }
        values.put(Note._DATE,DateConverter.fromDateToString(entity.getDate(),DateConverter.DEFAULT_FORMAT));
        values.put(Note._DESC, entity.getDescription());
        values.put(Note._TITLE, entity.getTitle());

        // Insert the new row, returning the primary key value of the new row
        return db.insert(Note._TABLE, null, values);
    }

    public static long insert(int parentId, Photo entity, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();

        values.put(Photo._NOTE_ID, parentId);
        values.put(Photo._DESC, entity.getDescription());
        values.put(Photo._PHOTO,entity.getBytecode());
        values.put(Photo._SCALE, entity.getScale());

        return db.insert(Photo._TABLE, null, values);
    }

    public static long insert(int parentId, Text entity, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();

        values.put(Text._NOTE_ID, parentId);
        values.put(Text._POS_X, entity.getPosX());
        values.put(Text._POS_Y, entity.getPosY());
        values.put(Text._SIZE_X, entity.getSizeX());
        values.put(Text._TEXT, entity.getText());


        return db.insert(Text._TABLE, null, values);
    }

    public static long insert(int parentId, ToDoList entity, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();

        values.put(ToDoList._NOTE_ID,parentId);
        values.put(ToDoList._POS_X, entity.getPosX());
        values.put(ToDoList._POS_Y, entity.getPosY());
        values.put(ToDoList._SIZE_X, entity.getSizeX());
        values.put(ToDoList._TITLE, entity.getTitle());

        return db.insert(ToDoList._TABLE, null, values);
    }

    public static long insert(int parentId, ToDoElement entity, SQLiteDatabase db)
    {
        ContentValues values = new ContentValues();

        values.put(ToDoElement._DONE, entity.isDone()?1:0);
        values.put(ToDoElement._PRIORITY, entity.getPriority());
        values.put(ToDoElement._TODO_LIST_ID, parentId);
        values.put(ToDoElement._TEXT, entity.getText());

        return db.insert(ToDoElement._TABLE, null, values);
    }

    public static int delete(String table, String idName, int id, SQLiteDatabase db)
    {
        String[] args = { Integer.toString(id) };
        return db.delete(table, idName + " like ?", args);
    }

    public static int update(int id, SQLiteDatabase db, Note entity)
    {
        ContentValues values = new ContentValues();

        String[] args = { Integer.toString(id) };

        Object str = entity.getDescription();
        if(str!=null)
        {
            values.put(Note._DESC, (String)str);
        }
        str = entity.getTitle();
        if(str!=null)
        {
            values.put(Note._TITLE, (String)str);
        }
        str = entity.getDate();
        if(str!=null)
        {
            values.put(Note._DATE, DateConverter.fromDateToString((Date)str,DateConverter.DEFAULT_FORMAT));
        }

        if(values.size()<=0)
        {
            return 0;
        }

        return db.update(Note._TABLE, values, Note._ID + " LIKE ?", args);
    }

    public static int update(int id, SQLiteDatabase db, Photo entity)
    {
        ContentValues values = new ContentValues();

        String[] args =  { Integer.toString(id) };

        Object str = entity.getBytecode();
        if(str!=null)
        {
            values.put(Photo._PHOTO, (byte[])str);
        }

        str = entity.getScale();
        if((float)str<0)
        {
            values.put(Photo._SCALE,(float)str);
        }

        str = entity.getDescription();
        if(str!=null)
        {
            values.put(Photo._DESC,(String)str);
        }

        if(values.size()<=0)
        {
            return 0;
        }

        return db.update(Photo._TABLE,values, Photo._ID + " LIKE ?", args);
    }



}
