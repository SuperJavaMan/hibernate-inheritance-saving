package com.example.hibernateinheritancesaving.model.InheritanceDiscriminator;

import lombok.*;

import javax.persistence.*;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Entity
@Inheritance
@DiscriminatorColumn
@Data
@ToString
@EqualsAndHashCode
public abstract class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
