package com.learning.designPatterns.creationalDP.builder.controller;

import com.learning.designPatterns.creationalDP.builder.model.Student;

public class Controller {

    public static void main(String[] args) {
        Student student = Student
                .builder()
                .age(28)
                .name("Aman Singh")
                .email("amanakmsd@gmail.com")
                .build();

        System.out.println(student.getName());
        try {
            Student student2 = Student
                    .builder()
                    .age(28)
                    .name("Aman Singh")
                    .email("amanak")
                    .build();

            System.out.println(student2.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
