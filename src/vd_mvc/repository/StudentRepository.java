package vd_mvc.repository;

import vd_mvc.model.Student;

public interface StudentRepository {
    Student[] findAll();
    void addStudent(Student student);
    void updateStudent(Student student);
    void remove(int index);
    Student findByIndex(int index);
}
