package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class TutorTest {
    @Test
    public void testTutorInitialization() {
        String name = "John";
        String surname = "Doe";
        String nickname = "johndoe";
        String password = "password";
        String level = "A1";
        String speciality = "English";
        List<Quiz> quizzes = new ArrayList<>();

        Tutor tutor = new Tutor(name, surname, nickname, password, level, speciality, quizzes);

        assertNotNull(tutor);
        assertEquals(name, tutor.getName());
        assertEquals(surname, tutor.getSurname());
        assertEquals(nickname, tutor.getNickname());
        assertEquals(password, tutor.getPassword());
        assertEquals(level, tutor.getLevel());
        assertEquals(speciality, tutor.getSpeciality());
        assertEquals(quizzes, tutor.getQuizzes());
    }
}
