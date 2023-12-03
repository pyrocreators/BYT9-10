package org.example;
import org.junit.Test;

import java.util.*;
import java.util.Optional;

import static org.junit.Assert.*;
public class QuizTest {
    @Test
    public void testQuizInitialization() {
        String language = "English";
        String difficulty = "B2";
        String name = "Quiz 1";
        Integer numberOfQuestions = 0;
        Optional<Integer> maxPoints = Optional.of(10);
        List<Question> questions = new ArrayList<>();
        User createdBy = new Tutor("John", "Foo", "johnFoo123", "password123", "B2", "English", new ArrayList<>());

        Quiz quiz = new Quiz(language, difficulty, name, maxPoints, questions, createdBy);

        assertNotNull(quiz);
        assertEquals(language, quiz.getLanguage());
        assertEquals(difficulty, quiz.getDifficulty());
        assertEquals(name, quiz.getName());
        assertEquals(numberOfQuestions, quiz.getNumberOfQuestions());
        assertEquals(maxPoints, quiz.getMaxPoints());
        assertEquals(questions, quiz.getQuestions());
        assertEquals(createdBy, quiz.getCreatedBy());
    }
}
