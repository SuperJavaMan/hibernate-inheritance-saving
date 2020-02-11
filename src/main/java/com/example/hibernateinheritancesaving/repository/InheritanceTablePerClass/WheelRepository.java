package com.example.hibernateinheritancesaving.repository.InheritanceTablePerClass;

import com.example.hibernateinheritancesaving.model.InheritanceTablePerClass.Wheel;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Repository
public class WheelRepository extends AbstractCrudRepository<Wheel> {

    @Override
    protected String entityName() {
        return "Wheel";
    }
}
