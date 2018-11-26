package com.apps.adudek.planner.enums;

/**
 * enum contains information about actual fragment
 */

public enum FragmentType {

    /**
     * main fragment; contains timeline and basic events
     */

    MAIN,

    /**
     * fragment that contains add panel, where you can add new Event
     */

    ADD,

    /**
     * fragments that contains timeline and specific events
     *
     * HIGH_STUDENT - high school
     *
     * STUDENT - middle school, junior high school
     */

    HIGH_STUDENT,

    STUDENT
}
