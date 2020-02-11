package com.example.hibernateinheritancesaving.controller.InheritanceDiscriminator;

import com.example.hibernateinheritancesaving.model.InheritanceDiscriminator.Manager;
import com.example.hibernateinheritancesaving.model.InheritanceDiscriminator.Programmer;
import com.example.hibernateinheritancesaving.repository.InheritanceDiscriminator.ManagerRepository;
import com.example.hibernateinheritancesaving.repository.InheritanceDiscriminator.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/pro")
public class ProgrammerController {

    @Autowired
    private ProgrammerRepository repository;

    @GetMapping
    public List<Programmer> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Programmer getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Programmer add(@RequestBody Programmer entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Programmer update(@RequestBody Programmer entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
