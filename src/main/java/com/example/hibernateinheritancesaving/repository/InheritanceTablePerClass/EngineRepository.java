package com.example.hibernateinheritancesaving.repository.InheritanceTablePerClass;

import com.example.hibernateinheritancesaving.model.InheritanceTablePerClass.Engine;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Repository
public class EngineRepository extends AbstractCrudRepository<Engine> {

    @Override
    protected String entityName() {
        return "Engine";
    }
}
