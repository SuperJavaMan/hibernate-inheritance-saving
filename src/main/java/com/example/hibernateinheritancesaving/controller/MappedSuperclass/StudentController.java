package com.example.hibernateinheritancesaving.controller.MappedSuperclass;

import com.example.hibernateinheritancesaving.model.MappedSuperclass.Student;
import com.example.hibernateinheritancesaving.repository.MappedSuperclass.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/stud")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getAllStudents() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.addEntity(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return repository.updateEntity(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
