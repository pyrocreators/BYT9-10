package org.example;

import java.util.List;
import java.util.Optional;

public class Quiz extends PlacementTest {
    private String name;
    private Integer numberOfQuestions;
    private Optional<Integer> maxPoints = Optional.empty();
    private List<Question> questions;
    private User createdBy;

    public Quiz(String language, String difficulty, String name, Optional<Integer> maxPoints, List<Question> questions, User createdBy) {
        super(language, difficulty);
        this.name = name;
        this.numberOfQuestions = questions.size();
        this.maxPoints = maxPoints;
        for (Question question: questions
             ) {
            if(question.getDifficulty() != difficulty){
                throw new IllegalArgumentException("Question difficulty does not match quiz difficulty");
            }
        }
        this.questions = questions;
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public Optional<Integer> getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Optional<Integer> maxPoints) {
        this.maxPoints = maxPoints;
    }

    public List<Question> getQuestions() {
        return questions;
    }


    public void editLearningSet() {
        System.out.println("Learning set edited");
    }

    public void createQuiz(){
        System.out.println("Quiz created");
    }

  public void addQuestion(Question question) {
        if(this.questions.contains(question)){
           throw new IllegalArgumentException("Question already exists");
        }
        this.questions.add(question);
        numberOfQuestions++;
  }

  public void removeQuestion(Question question) {
        if(this.questions.contains(question)){
           throw new IllegalArgumentException("Question does not exist");
        }
        this.questions.remove(question);
        numberOfQuestions--;
  }

  public void publishQuiz(){
      System.out.println("Quiz published");
  }

  public void participateInQuiz(){
      System.out.println("Quiz participated");
  }

    public User getCreatedBy() {
        return createdBy;
    }
}
