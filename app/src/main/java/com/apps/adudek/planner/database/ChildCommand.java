package com.apps.adudek.planner.database;

import com.apps.adudek.planner.database.entities.Entity;
import com.apps.adudek.planner.others.Command;

/**
 * ChildCommand - interface used to implement Command Design Pattern
 *
 * Usages:
 * Method each()
 * @see com.apps.adudek.planner.database.entities.ChildArray
 */
public interface ChildCommand extends Command {

    /**
     * Method, which executes instructions for proper Entity
     *
     * @param e - entity, which'll be used in method
     */
    void execute(Entity e);

}
