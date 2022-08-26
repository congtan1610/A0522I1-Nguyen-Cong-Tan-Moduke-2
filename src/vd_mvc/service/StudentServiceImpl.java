package vd_mvc.service;

import vd_mvc.model.Student;
import vd_mvc.repository.StudentRepository;
import vd_mvc.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{
    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Student findByIndex(int index) {
        return null;
    }
}
