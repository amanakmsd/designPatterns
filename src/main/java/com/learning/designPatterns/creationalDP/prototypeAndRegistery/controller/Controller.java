package com.learning.designPatterns.creationalDP.prototypeAndRegistery.controller;

import com.learning.designPatterns.creationalDP.prototypeAndRegistery.model.IntelligentStudent;
import com.learning.designPatterns.creationalDP.prototypeAndRegistery.model.Student;
import com.learning.designPatterns.creationalDP.prototypeAndRegistery.registery.StudentRegistery;

public class Controller {

    public static void main(String[] args) {
        StudentRegistery studentRegistery = new StudentRegistery();
        studentRegistery.save("Intelligent", new IntelligentStudent(10, "Aman", 15));
        studentRegistery.save("Student", new Student(6, "Aman2"));



        IntelligentStudent student = (IntelligentStudent) studentRegistery.get("Intelligent").copy();
        System.out.println(student.getMarks());



    }
}
