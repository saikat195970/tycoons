package com.saikat.tycoons.controller;

import com.saikat.tycoons.entity.Student;
import com.saikat.tycoons.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @PostMapping()
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> findStudentById(@PathVariable long id) {
        return new ResponseEntity<Optional<Student>>(studentService.findStudentById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable long id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<String>("Student has been deleted..",HttpStatus.ACCEPTED);
    }
}
