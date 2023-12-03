package org.example;
import org.junit.Test;

import java.time.Instant;
import java.util.*;
import static org.junit.Assert.*;

public class DailyChallangeTest {
    @Test
    public void testDailyChallange(){
        Tutor tutor = new Tutor("John", "Doe", "JD1123", "password123", "C2", "ENG", new ArrayList<Quiz>());
        Quiz quiz = new Quiz("English", "Easy", "Quiz1", Optional.of(10), new ArrayList<Question>(), tutor);
        DailyChallange dailyChallange = new DailyChallange(quiz, Instant.now());
        assertEquals(quiz, dailyChallange.getDailyQuiz());
        assertEquals(Instant.now(), dailyChallange.getQuizDay());
    }
}
