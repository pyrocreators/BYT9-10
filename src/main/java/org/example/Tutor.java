package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends User {
    private String speciality;
    private List<Homework> homeworks;
    private List<Quiz> quizzes;

    public Tutor(String name, String surname, String nickname, String password, String level, String speciality, List<Quiz> quizzes) {
        super(name, surname, nickname, password, level);
        this.speciality = speciality;
        this.quizzes = quizzes;
    }

    @Override
    void setProficiencyLevel(String lang, String level) {
        System.out.println("Tutor proficiency level is set!");
    }

    public void addHomework(Homework homework) {
        if(homework == null) {
            homeworks = new ArrayList<>();
        }

        if(homeworks.contains(homework)) {
            System.out.println("Homework already exists!");
        }

        homeworks.add(homework);
    }

    public void removeHomework(Homework homework) {
        if(homework == null) {
            homeworks = new ArrayList<>();
        }

        if(homeworks.contains(homework)) {
            System.out.println("Homework already exists!");
        }

        homeworks.remove(homework);
    }

    public void addQuiz(Quiz quiz) {
        if(quiz == null) {
            homeworks = new ArrayList<>();
        }

        if(homeworks.contains(quiz)) {
            System.out.println("quiz already exists!");
        }

        quizzes.add(quiz);
    }

    public void removeQuiz(Quiz quiz) {
        if(quiz == null) {
            homeworks = new ArrayList<>();
        }

        if(homeworks.contains(quiz)) {
            System.out.println("Homework already exists!");
        }

        homeworks.remove(quiz);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }
}
