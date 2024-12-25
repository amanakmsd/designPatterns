package com.learning.designPatterns.creationalDP.prototypeAndRegistery.model;

public class IntelligentStudent extends Student {

    int marks;
    public IntelligentStudent(int age, String name,int marks) {
        super(age, name);
        this.marks = marks;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.marks = student.marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
