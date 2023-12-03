package org.example;

import java.time.Instant;

public class TestToVerifyLevel {
    private Quiz quiz;
    private Instant createdAt;

    public TestToVerifyLevel(Quiz quiz) {
        this.quiz = quiz;
        this.createdAt = Instant.now();
    }

    public void takePlacementTest() {
        System.out.println("Placement test taken");
    }
}
