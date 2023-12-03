package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class HomeworkTest {

            @Test
            public void testHomeworkInitialization() {
                int totalPoints = 10;
                List<Task> tasks = new ArrayList<>();
                Date deadline = new Date();

                Homework homework = new Homework(totalPoints, tasks, deadline) {
                    @Override
                    public void assignHomeworkToClass(Class aClass) {
                    }

                    @Override
                    public void submitWork(Student student) {
                    }

                    @Override
                    public void viewWorksToCheck() {
                    }
                };

                assertNotNull(homework);
                assertEquals(totalPoints, homework.getTotalPoints());
                assertEquals(tasks, homework.getTasks());
                assertEquals(deadline, homework.getDeadline());
            }
}
