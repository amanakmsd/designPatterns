package com.learning.designPatterns.creationalDP.builder.model;

import com.learning.designPatterns.creationalDP.builder.builder.StudentBuilder;

public class Student {
    private String name;
    private String emailId;
    private int age;

    public Student(StudentBuilder s) {
        this.name = s.getName();
        this.emailId = s.getEmail();
        this.age = s.getAge();
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }
}
