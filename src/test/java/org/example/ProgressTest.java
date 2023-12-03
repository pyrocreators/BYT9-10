package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class ProgressTest {

    @Test
    public void testProgressInitialization() {
        String language = "English";
        String difficulty = "B2";
        String question = "What is the capital of France?";
        String answer = "Paris";
        User createdBy = new Tutor("John", "Foo", "johnFoo123", "password123", "B2", "English", new ArrayList<>());

        Question questionObj = new Question(language, question, difficulty, answer, createdBy);

        assertNotNull(question);
        assertEquals(language, questionObj.getLanguage());
        assertEquals(difficulty, questionObj.getDifficulty());
        assertEquals(question, questionObj.getQuestion());
        assertEquals(answer, questionObj.getAnswer());
        assertEquals(createdBy, questionObj.getCreatedBy());
    }
}
