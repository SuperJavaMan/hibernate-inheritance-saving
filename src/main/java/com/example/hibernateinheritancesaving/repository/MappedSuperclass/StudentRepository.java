package com.example.hibernateinheritancesaving.repository.MappedSuperclass;

import com.example.hibernateinheritancesaving.model.MappedSuperclass.Student;
import com.example.hibernateinheritancesaving.repository.AbstractCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Repository
public class StudentRepository extends AbstractCrudRepository<Student> {

    @Override
    protected String entityName() {
        return "Student";
    }
}
