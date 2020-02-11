package com.example.hibernateinheritancesaving.model.InheritanceTablePerClass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */

@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Wheel extends AbstractPart {

    private int diameter;

}
