package com.example.hibernateinheritancesaving.repository.InheritanceJoined;

import com.example.hibernateinheritancesaving.model.InheritanceJoined.Phone;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Repository
public class PhoneRepository extends AbstractCrudRepository<Phone> {

    @Override
    protected String entityName() {
        return "Phone";
    }
}
