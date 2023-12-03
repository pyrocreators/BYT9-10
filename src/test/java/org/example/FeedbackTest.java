package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class FeedbackTest {
    @Test
    public void testFeedback(){
        Homework homework = new Homework(10, new ArrayList<Task>(), new Date());
        Feedback feedback = new Feedback(10, "Good", homework);
        assertEquals(10, feedback.getMark());
        assertEquals("Good", feedback.getDescription());
        assertEquals(homework, feedback.getHomeworkToHaveFeedback());
    }
}
