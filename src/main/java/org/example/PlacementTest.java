package org.example;

import java.util.List;

public abstract class PlacementTest {
    private String language;
    private String difficulty;

    public PlacementTest(String language, String difficulty) {
        this.language = language;
        this.difficulty = difficulty;
    }

    public String getLanguage() {
        return language;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public abstract List<Question> getQuestions();
}
