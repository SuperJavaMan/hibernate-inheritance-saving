package com.example.hibernateinheritancesaving.controller.MappedSuperclass;

import com.example.hibernateinheritancesaving.model.MappedSuperclass.Professor;
import com.example.hibernateinheritancesaving.repository.MappedSuperclass.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/prof")
public class ProfessorController {

    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Professor getProfessorById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Professor addProfessor(@RequestBody Professor entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Professor updateProfessor(@RequestBody Professor entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessor(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
