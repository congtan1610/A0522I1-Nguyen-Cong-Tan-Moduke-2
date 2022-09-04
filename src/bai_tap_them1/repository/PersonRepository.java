package bai_tap_them1.repository;

import bai_tap_them1.model.Person;

public interface PersonRepository {
    void addStudent(Person.Student student);

    void addTeacher(Person.Teacher teacher);

    void showStudent();

    void showTeacher();

    void removeStudent(String idRemove);

    void removeTeacher(String idRemove);

}
