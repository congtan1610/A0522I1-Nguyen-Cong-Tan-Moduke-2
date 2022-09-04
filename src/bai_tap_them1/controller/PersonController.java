package bai_tap_them1.controller;

import bai_tap_them1.model.Person;
import bai_tap_them1.service.PersonServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class PersonController {
    public static PersonServiceImpl personController;

    static {
        personController = new PersonServiceImpl();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        do {
            System.out.println("\n--CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách học sinh hoặc giảng viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("1. Thêm giảng viên ");
                    System.out.println("2. Thêm sinh viên ");
                    int a = input.nextInt();
                    if (a == 2) {
                        addStudent(input);//method cuối trang
                    } else if (a == 1) {
                        addTeacher(input);//method cuối trang
                    } else break;
                    break;
                case 2:
                    System.out.print("Nhập mã muốn xóa: ");
                    String idRemove = input.next();
                    if (idRemove.charAt(0) == 'G') {
                        personController.removeTeacher(idRemove);
                        personController.showTeacher();
                    } else if (idRemove.charAt(0) == 'H') {
                        personController.removeStudent(idRemove);
                        personController.showStudent();
                    } else {
                        System.out.println(idRemove + " không có trong danh sách");
                    }
                    break;
                case 3:
                    System.out.println("1. Xem giảng viên ");
                    System.out.println("2. Xem sinh viên ");
                    int b = input.nextInt();
                    if (b == 2) {
                        personController.showStudent();
                    } else if (b == 1) {
                        personController.showTeacher();
                    } else break;
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    private static void addTeacher(Scanner input) {
        System.out.print("Nhập id:");
        String idTeacher = input.next();
        System.out.print("Nhập tên:");
        String nameTeacher = input.next();
        System.out.print("Nhập ngày sinh:");
        Object dateTeacher = input.next();
        System.out.print("Nhập giới tính:");
        String genderTeacher = input.next();
        System.out.print("Nhập chuyên môn:");
        String specialize = input.next();
        Person.Teacher teacher = new Person.Teacher(idTeacher, nameTeacher, dateTeacher, genderTeacher, specialize);
        personController.addTeacher(teacher);
        personController.showTeacher();
    }

    private static void addStudent(Scanner input) {
        System.out.print("Nhập id:");
        String id = input.next();
        System.out.print("Nhập tên:");
        String name = input.next();
        System.out.print("Nhập ngày sinh:");
        Object date = input.next();
        System.out.print("Nhập giới tính:");
        String gender = input.next();
        System.out.print("Nhập lớp:");
        String className = input.next();
        System.out.print("Nhập điểm:");
        Double point = input.nextDouble();
        Person.Student student = new Person.Student(id, name, date, gender, className, point);
        personController.addStudent(student);
        personController.showStudent();
    }
}
