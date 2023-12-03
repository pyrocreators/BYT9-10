package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class GroupQuizTest {
@Test
    public void testGroupQuiz(){
        Class aClass = new Class("Class 1", new ArrayList<Student>(), new ArrayList<Homework>(), new ArrayList<Tutor>());
        GroupQuiz groupQuiz = new GroupQuiz("Group Quiz 1", aClass);
        assertEquals("Group Quiz 1", groupQuiz.getName());
        assertEquals(0, groupQuiz.getNumberOfStudents().intValue());
        assertEquals(aClass, groupQuiz.getAClass());
    }
}
