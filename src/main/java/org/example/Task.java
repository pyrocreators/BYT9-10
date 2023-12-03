package org.example;

public class Task {
    private String description;
    private Integer maxPoints;

    public Task(String description, Integer maxPoints) {
        this.description = description;
        this.maxPoints = maxPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public void solveTask() {
        System.out.println("Task is solved!");
    }
}
