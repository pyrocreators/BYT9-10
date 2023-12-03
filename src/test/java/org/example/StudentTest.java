package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudentInitialization() {
        String name = "John";
        String surname = "Foo";
        String nickname = "johnFoo123";
        String password = "password123";
        String level = "B2";

        Student student = new Student(name, surname, nickname, password, level);

        assertNotNull(student);
        assertEquals(name, student.getName());
        assertEquals(surname, student.getSurname());
        assertEquals(nickname, student.getNickname());
        assertEquals(password, student.getPassword());
        assertEquals(level, student.getLevel());
    }
}
