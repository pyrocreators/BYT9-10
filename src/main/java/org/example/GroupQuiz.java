package org.example;

public class GroupQuiz {
    private String name;
    private Integer numberOfStudents;
    private Class aClass;

    public GroupQuiz(String name, Class aClass){
        this.name = name;
        this.numberOfStudents = aClass.getStudentList().size();
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public Class getAClass() {
        return aClass;
    }

    public void manageGroup(){
        System.out.println("Group managed");
    }

    public void manageAssigments(){
        System.out.println("Assigments managed");
    }

    public void createGroupQuiz(){
        System.out.println("Group quiz created");
    }
}
