package com.example.hibernateinheritancesaving.controller.InheritanceJoined;

import com.example.hibernateinheritancesaving.model.InheritanceDiscriminator.Manager;
import com.example.hibernateinheritancesaving.model.InheritanceJoined.Potato;
import com.example.hibernateinheritancesaving.model.MappedSuperclass.Professor;
import com.example.hibernateinheritancesaving.repository.InheritanceJoined.PotatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/pot")
public class PotatoController {

    @Autowired
    private PotatoRepository repository;

    @GetMapping
    public List<Potato> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Potato getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Potato add(@RequestBody Potato entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Potato update(@RequestBody Potato entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
