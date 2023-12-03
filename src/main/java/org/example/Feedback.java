package org.example;

public class Feedback {
    private int mark;
    private String description;
    private Homework homeworkToHaveFeedback;

    public Feedback(int mark, String description, Homework homeworkToHaveFeedback) {
        this.mark = mark;
        this.description = description;
        this.homeworkToHaveFeedback = homeworkToHaveFeedback;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Homework getHomeworkToHaveFeedback() {
        return homeworkToHaveFeedback;
    }

    public void setHomeworkToHaveFeedback(Homework homeworkToHaveFeedback) {
        this.homeworkToHaveFeedback = homeworkToHaveFeedback;
    }
}
