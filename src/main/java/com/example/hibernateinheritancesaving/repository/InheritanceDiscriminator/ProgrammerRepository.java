package com.example.hibernateinheritancesaving.repository.InheritanceDiscriminator;

import com.example.hibernateinheritancesaving.model.InheritanceDiscriminator.Programmer;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */

@Repository
public class ProgrammerRepository extends AbstractCrudRepository<Programmer> {
    @Override
    protected String entityName() {
        return "Programmer";
    }
}
