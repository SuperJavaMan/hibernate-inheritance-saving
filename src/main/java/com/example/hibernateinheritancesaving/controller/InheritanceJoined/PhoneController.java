package com.example.hibernateinheritancesaving.controller.InheritanceJoined;

import com.example.hibernateinheritancesaving.model.InheritanceJoined.Phone;
import com.example.hibernateinheritancesaving.model.InheritanceJoined.Potato;
import com.example.hibernateinheritancesaving.repository.InheritanceJoined.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/phn")
public class PhoneController {

    @Autowired
    private PhoneRepository repository;

    @GetMapping
    public List<Phone> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Phone getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Phone add(@RequestBody Phone entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Phone update(@RequestBody Phone entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
