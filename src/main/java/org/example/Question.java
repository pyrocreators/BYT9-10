package org.example;

import java.util.List;

public class Question extends PlacementTest {
    private String question;
    private String answer;
    private String difficulty;
    private User createdBy;

    public Question(String language, String question, String difficulty, String answer, User createdBy) {
        super(language, difficulty);
        this.difficulty = difficulty;
        this.question = question;
        this.answer = answer;
        this.createdBy = createdBy;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDifficulty() {
        return difficulty;
    }

    @Override
    public List<Question> getQuestions() {
        return null;
    }

    public User getCreatedBy() {
        return createdBy;
    }
}
