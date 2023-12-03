package org.example;

public class Student extends User {

    public Student(String name, String surname, String nickname, String password, String level) {
        super(name, surname, nickname, password, level);
    }

    @Override
    void setProficiencyLevel(String lang, String level) {
    }
}
