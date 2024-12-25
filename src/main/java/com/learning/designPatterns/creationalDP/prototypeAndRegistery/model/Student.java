package com.learning.designPatterns.creationalDP.prototypeAndRegistery.model;

import com.learning.designPatterns.creationalDP.prototypeAndRegistery.prototype.Prototype;

public class Student implements Prototype<Student> {

    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
