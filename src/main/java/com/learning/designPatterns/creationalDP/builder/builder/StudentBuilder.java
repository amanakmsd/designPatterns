package com.learning.designPatterns.creationalDP.builder.builder;

import com.learning.designPatterns.creationalDP.builder.model.Student;

import java.util.UnknownFormatConversionException;
import java.util.regex.Pattern;

public class StudentBuilder {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private String name;
    private String email;
    private int age;

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Student build() {
        //Add validation for properties if needed
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        boolean isValid =  pattern.matcher(email).matches();
        if(!isValid)
            throw new UnknownFormatConversionException("Invalid email");

        return new Student(this);
    }
}
