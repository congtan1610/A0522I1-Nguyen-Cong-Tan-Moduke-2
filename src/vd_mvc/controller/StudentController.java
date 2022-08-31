package vd_mvc.controller;

import vd_mvc.model.Student;
import vd_mvc.service.StudentService;
import vd_mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {

    private static StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("---- Student Manager ----");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("3. Find by id");
            System.out.println("4. Update Student");
            System.out.println("5. Remove Student");
            System.out.println("9. Exit");

            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1: //List
                    Student[] studentList = studentService.findAll();
                    for(Student student: studentList){
                        System.out.println(student);
                    }
                    break;
                case 2: //add
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);

                    studentService.addStudent(student);
                    break;
                case 3://find by id
                    System.out.print("Enter id:");
                    int idFind=Integer.parseInt(scanner.nextLine());
                    if (studentService.findByIndex(idFind)==null){
                        System.out.println("not found by id");
                    }else{
                        System.out.println(studentService.findByIndex(idFind));
                    }
                    break;
                case 4://updateStudents
                    System.out.print("Input Id Update: ");
                    int idUp = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String nameUp = scanner.nextLine();
                    Student students = new Student(idUp, nameUp);
                    studentService.updateStudent(students);
                    Student[] studentListUp = studentService.findAll();
                    for(Student stu: studentListUp){
                        System.out.println(stu);
                    }
                    break;
                case 5://remove student
                    System.out.print("Input Id Remove: ");
                    int idRe = Integer.parseInt(scanner.nextLine());
                    studentService.remove(idRe);
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
