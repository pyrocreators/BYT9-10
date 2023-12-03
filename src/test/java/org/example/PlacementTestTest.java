package org.example;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class PlacementTestTest {

        @Test
        public void testPlacementTestInitialization() {
            String language = "English";
            String difficulty = "B2";

            PlacementTest placementTest = new PlacementTest(language, difficulty) {
                @Override
                public List<Question> getQuestions() {
                    return null;
                }
            };

            assertNotNull(placementTest);
            assertEquals(language, placementTest.getLanguage());
            assertEquals(difficulty, placementTest.getDifficulty());
        }
}
