package com.georgian.autowire;

public class Student {
    private String name;
    private String interestCourse;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterestCourse() {
        return interestCourse;
    }

    public void setInterestCourse(String interestCourse) {
        this.interestCourse = interestCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void display(){
        System.out.println("Studetn name "+name+
                "Student intreset course "+interestCourse
        +"Student hobby "+hobby);
    }
}
