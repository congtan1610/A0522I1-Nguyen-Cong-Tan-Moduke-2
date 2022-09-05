package bai_tap_them1.repository;

import bai_tap_them1.model.Person;

import java.util.ArrayList;

public class PersonRepositoryImpl implements PersonRepository {
    private ArrayList<Person.Teacher> teacherList;
    private ArrayList<Person.Student> studentList;

    {
        teacherList = new ArrayList<>();
        teacherList.add(new Person.Teacher("GV01", "tan", 16 / 10 / 2001, "nam", "trainer"));
        teacherList.add(new Person.Teacher("GV02", "tan", 16 / 10 / 2001, "nam", "trainer"));
        studentList = new ArrayList<>();
        studentList.add(new Person.Student("HS01", "tan", 16 / 10 / 2001, "nam", "19T1", 9.0));
        studentList.add(new Person.Student("HS02", "tan", 16 / 10 / 2001, "nam", "19T1", 9.0));
    }

    @Override
    public void addStudent(Person.Student student) {
        studentList.add(student);
    }

    @Override
    public void addTeacher(Person.Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void showStudent() {
        if (studentList.size() == 0) {
            System.out.println("danh sách rỗng");
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i));
            }
        }
    }

    @Override
    public void showTeacher() {
        if (teacherList.size() == 0) {
            System.out.println("danh sách rỗng");
        } else {
            for (int i = 0; i < teacherList.size(); i++) {
                System.out.println(teacherList.get(i));
            }
        }
    }

    @Override
    public void removeStudent(String idRemove) {
        boolean flag = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (idRemove.equals(studentList.get(i).getId())) {
                studentList.remove(i);
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void removeTeacher(String idRemove) {
        boolean flag = true;
        for (int i = 0; i < teacherList.size(); i++) {
            if (idRemove.equals(teacherList.get(i).getId())) {
                teacherList.remove(i);
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("không tìm thấy");
        }
    }


}
