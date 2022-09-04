package bai_tap_them1.service;

import bai_tap_them1.model.Person;

public interface PersonService {
    void addStudent(Person.Student student);

    void addTeacher(Person.Teacher teacher);

    void showStudent();

    void showTeacher();

    void removeStudent(String idRemove);

    void removeTeacher(String idRemove);

    int getSizeStudent();

    int getSizeTeacher();
}
