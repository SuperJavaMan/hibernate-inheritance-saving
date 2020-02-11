package com.example.hibernateinheritancesaving.controller.InheritanceTablePerClass;

import com.example.hibernateinheritancesaving.model.InheritanceJoined.Phone;
import com.example.hibernateinheritancesaving.model.InheritanceTablePerClass.Wheel;
import com.example.hibernateinheritancesaving.repository.InheritanceTablePerClass.WheelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@RestController
@RequestMapping("/whl")
public class WheelController {

    @Autowired
    private WheelRepository repository;

    @GetMapping
    public List<Wheel> getAll() {
        return repository.getAll();
    }

    @GetMapping("/{id}")
    public Wheel getById(@PathVariable Long id) {
        return repository.getEntityById(id);
    }

    @PostMapping
    public Wheel add(@RequestBody Wheel entity) {
        return repository.addEntity(entity);
    }

    @PutMapping
    public Wheel update(@RequestBody Wheel entity) {
        return repository.updateEntity(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteEntity(id);
    }
}
