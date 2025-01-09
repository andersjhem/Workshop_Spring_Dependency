package org.example.data_access;


import org.example.models.Student;

import java.util.List;


public class StudentDaoListImpl implements Student_Dao {
    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }
}
