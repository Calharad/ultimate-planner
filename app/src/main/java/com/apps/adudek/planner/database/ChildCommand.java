package com.apps.adudek.planner.database;

import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.others.Command;

public interface ChildCommand extends Command {

    void execute(Entity e);

}
