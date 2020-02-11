package com.example.hibernateinheritancesaving.repository.MappedSuperclass;

import com.example.hibernateinheritancesaving.model.MappedSuperclass.Professor;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */

@Repository
public class ProfessorRepository extends AbstractCrudRepository<Professor> {
    @Override
    protected String entityName() {
        return "Professor";
    }
}
