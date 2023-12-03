package org.example;

import java.time.Instant;

public class DailyChallange {
    private Quiz dailyQuiz;
    private Instant quizDay;

    public DailyChallange(Quiz dailyQuiz, Instant quizDay) {
        this.dailyQuiz = dailyQuiz;
        this.quizDay = quizDay;
    }

    public void solveDailyQuiz(){
        System.out.println("Solving daily quiz");
    }

    public Quiz getDailyQuiz() {
        return dailyQuiz;
    }

    public void setDailyQuiz(Quiz dailyQuiz) {
        this.dailyQuiz = dailyQuiz;
    }

    public Instant getQuizDay() {
        return quizDay;
    }

    public void setQuizDay(Instant quizDay) {
        this.quizDay = quizDay;
    }
}
