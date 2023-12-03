package org.example;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestToVerifyLevelTest {
@Test
    public void testTestToVerifyLevelTestInitialization() {
        String description = "Task description";
        Integer maxPoints = 10;

        Task task = new Task(description, maxPoints);

        assertNotNull(task);
        assertEquals(description, task.getDescription());
        assertEquals(maxPoints, task.getMaxPoints());
    }
}
