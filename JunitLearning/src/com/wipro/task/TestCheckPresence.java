package com.wipro.task;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {
        DailyTasks dt = new DailyTasks();
        assertTrue(dt.checkPresence("welcome to wipro", "wipro"));
    }

    @Test
    public void testCheckPresenceFalse() {
        DailyTasks dt = new DailyTasks();
        assertFalse(dt.checkPresence("welcome to wipro", "infosys"));
    }
}