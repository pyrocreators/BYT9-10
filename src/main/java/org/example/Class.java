package org.example;

import java.util.List;

public class Class {
    private String name;
    private Integer numberOfstudents;
    private List<Student> studentList;
    private List<Homework> homeworks;
    private List<Tutor> tutor;

    public Class(String name, List<Student> studentList, List<Homework> homeworks,List<Tutor> tutor) {
        this.name = name;
        this.numberOfstudents = studentList.size();
        this.studentList = studentList;
        this.homeworks = homeworks;
        this.tutor = tutor;
    }


    public void addStudent(Student student) {
        studentList.add(student);
        numberOfstudents++;
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
        numberOfstudents--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfstudents() {
        return numberOfstudents;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Homework> getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(List<Homework> homeworks) {
        this.homeworks = homeworks;
    }

    public List<Tutor> getTutor() {
        return tutor;
    }

    public void setTutor(List<Tutor> tutor) {
        this.tutor = tutor;
    }

    public void startCountdownToAssignHomework() {
        System.out.println("Countdown started!");
    }

    private void createClass() {
        System.out.println("Class is created!");
    }

}
