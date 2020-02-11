package com.example.hibernateinheritancesaving.controller.InheritanceTablePerClass;

import com.example.hibernateinheritancesaving.model.InheritanceTablePerClass.Engine;
import com.example.hibernateinheritancesaving.model.InheritanceTablePerClass.Wheel;
import com.example.hibernateinheritancesaving.repository.InheritanceTablePerClass.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/eng")
public class EngineController {

    @Autowired
    private EngineRepository repository;

    @GetMapping
    public List<Engine> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Engine getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Engine add(@RequestBody Engine entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Engine update(@RequestBody Engine entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
