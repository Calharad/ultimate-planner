package com.apps.adudek.planner.database.entities;


import android.util.SparseArray;

import com.apps.adudek.planner.database.ChildCommand;

public class ChildArray <T extends Entity> {

    public void add(int id, T obj)
    {
        children.append(id,obj);
    }

    public T get(int id)
    {
        return children.get(id,null);
    }

    public void each(ChildCommand command)
    {
        int size = children.size();
        for(int i=0;i<size;i++)
        {
            command.execute(children.valueAt(i));
        }
    }

    public SparseArray getAll()
    {
        return children;
    }

    public void delete(int id)
    {
        children.delete(id);
    }

    private SparseArray<T> children;

}
