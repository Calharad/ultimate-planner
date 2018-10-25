package com.apps.adudek.planner.database.entities;

import com.apps.adudek.planner.others.Command;

public interface ChildCommand extends Command {

    void execute(Entity obj);

}
