package org.example.data_access;

import org.example.models.Student;

import java.util.List;

public interface Student_Dao {

    Student save(Student student);

    Student find(int id);

    List<Student> findAll();

    void delete(int id);
}


