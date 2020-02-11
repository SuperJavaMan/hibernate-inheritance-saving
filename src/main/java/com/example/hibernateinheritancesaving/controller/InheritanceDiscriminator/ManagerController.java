package com.example.hibernateinheritancesaving.controller.InheritanceDiscriminator;

import com.example.hibernateinheritancesaving.model.InheritanceDiscriminator.Manager;
import com.example.hibernateinheritancesaving.model.MappedSuperclass.Professor;
import com.example.hibernateinheritancesaving.repository.InheritanceDiscriminator.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/mng")
public class ManagerController {

    @Autowired
    private ManagerRepository repository;

    @GetMapping
    public List<Manager> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Manager getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Manager add(@RequestBody Manager entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Manager update(@RequestBody Manager entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
