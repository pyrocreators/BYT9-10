package org.example;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Homework {
    private int totalPoints;
    private List<Task> tasks;
    private Date deadline;
    private Instant createdAt;

    public Homework(int totalPoints, List<Task> tasks, Date deadline) {
        this.totalPoints = totalPoints;
        this.tasks = tasks;
        this.deadline = deadline;
        this.createdAt = Instant.now();
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void assignHomeworkToClass(Class aClass) {
        System.out.println("Homework is assigned to class!");
    }

    public void submitWork(Student student) {
        System.out.println("Work is submitted!");
    }

    public void viewWorksToCheck() {
        System.out.println("Works to check are viewed!");
    }

    public Date getDeadline() {
        return deadline;
    }
}
