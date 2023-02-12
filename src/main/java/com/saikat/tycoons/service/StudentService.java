package com.saikat.tycoons.service;

import com.saikat.tycoons.entity.Student;
import com.saikat.tycoons.exception.BusinessException;
import com.saikat.tycoons.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        if (student.getName().isEmpty() || student.getName().length() == 0) {
            throw new BusinessException("601", "Student name is empty..");
        }
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Optional<Student> findStudentById(long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

}
