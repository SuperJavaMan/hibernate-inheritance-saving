package com.example.hibernateinheritancesaving.model.InheritanceJoined;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Phone extends AbstractProduct {

    private int display;
}
