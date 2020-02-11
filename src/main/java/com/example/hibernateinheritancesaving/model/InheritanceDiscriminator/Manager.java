package com.example.hibernateinheritancesaving.model.InheritanceDiscriminator;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Entity
@DiscriminatorValue("Manager")
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {

    private String branch;
}
