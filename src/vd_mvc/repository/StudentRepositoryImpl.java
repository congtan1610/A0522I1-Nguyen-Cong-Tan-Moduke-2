package vd_mvc.repository;

import vd_mvc.model.Student;

import java.awt.*;
import java.util.ArrayList;

public class StudentRepositoryImpl implements StudentRepository {
    private static Student[] studentList;
    private static int size = 0;

    static {
        studentList = new Student[20];
        studentList[0] = new Student(1, "Nguyen Van A");
        studentList[1] = new Student(2, "Nguyen Van B");
        studentList[2] = new Student(3, "Nguyen Van C");
        studentList[3] = new Student(4, "Nguyen Van D");
        size = 4;

    }

    @Override
    public Student[] findAll() {

        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        /*kiểm tra size..*/
        studentList[size] = student;
        size++;
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (studentList[i].getId() == student.getId()) {
                studentList[i] = student;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index <= 0 || index > size) {
            System.out.println("not found id remove");
        } else {
            for (int i = index - 1; i < size; i++) {
                studentList[i] = studentList[i + 1];
            }
            size--;
            for (int i=0;i<size;i++){
                studentList[i].setId(i+1);
            }
            for (int i = 0; i < size; i++) {
                System.out.println(studentList[i]);
            }
        }

    }

    @Override
    public Student findByIndex(int index) {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        if (index <= 0 || index > size) {
            return null;
        } else {
            return students[index - 1];
        }
    }
}
