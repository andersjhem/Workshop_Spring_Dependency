package org.example;


import org.example.data_access.Student_Dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Main {
    public static <StudentDao> void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);
        StudentDao studentDao = (StudentDao) context.getBean(Student_Dao.class);
    }
}