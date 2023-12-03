package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;
public class ClassTest {
    @Test
    public void testClassInitializationInConstructor() {
        String className = "Biology";
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", "john123", "password123", "B1"));
        students.add(new Student("Alice", "Smith", "alice321", "pass456", "C2"));
        Homework homework1 = new Homework(12, new ArrayList<Task>(), new Date());
        Homework homework2 = new Homework(9, new ArrayList<Task>(), new Date());
        List<Homework> homeworks = new ArrayList<>();
        homeworks.add(homework1);
        homeworks.add(homework2);
        List<Tutor> tutors = new ArrayList<>();
        tutors.add(new Tutor("Tutor", "One", "tutor1", "tutorpass", "advanced", "Biology", new ArrayList<>()));

        Class aClass = new Class(className, students, homeworks, tutors);

        assertEquals(className, aClass.getName());
        assertEquals(Optional.of(2).get(), aClass.getNumberOfstudents());
        assertEquals(students, aClass.getStudentList());
        assertEquals(homeworks, aClass.getHomeworks());
        assertEquals(tutors, aClass.getTutor());
    }
    @Test
    public void testAddAndRemoveStudent() {
        String className = "Physics";
        List<Student> students = new ArrayList<>();
        List<Homework> homeworks = new ArrayList<>();
        List<Tutor> tutors = new ArrayList<>();
        Class aClass = new Class(className, students, homeworks, tutors);

        Student student1 = new Student("John", "Doe", "john123", "password123", "beginner");
        Student student2 = new Student("Alice", "Smith", "alice321", "pass456", "intermediate");

        aClass.addStudent(student1);
        aClass.addStudent(student2);

        assertEquals(Optional.of(2).get(), aClass.getNumberOfstudents());
        assertTrue(aClass.getStudentList().contains(student1));
        assertTrue(aClass.getStudentList().contains(student2));

        aClass.removeStudent(student1);

        assertEquals(Optional.of(1).get(), aClass.getNumberOfstudents());
        assertFalse(aClass.getStudentList().contains(student1));
        assertTrue(aClass.getStudentList().contains(student2));
    }

    @Test
    public void testSetHomeworks() {
        String className = "Math";
        List<Student> students = new ArrayList<>();
        List<Homework> initialHomeworks = new ArrayList<>();
        List<Homework> newHomeworks = new ArrayList<>();
        List<Tutor> tutors = new ArrayList<>();
        Class aClass = new Class(className, students, initialHomeworks, tutors);

        Homework homework1 = new Homework(12, new ArrayList<Task>(), new Date());
        Homework homework2 = new Homework(9, new ArrayList<Task>(), new Date());
        newHomeworks.add(homework1);
        newHomeworks.add(homework2);

        aClass.setHomeworks(newHomeworks);

        assertEquals(2, aClass.getHomeworks().size());
        assertTrue(aClass.getHomeworks().contains(homework1));
        assertTrue(aClass.getHomeworks().contains(homework2));
    }
}
