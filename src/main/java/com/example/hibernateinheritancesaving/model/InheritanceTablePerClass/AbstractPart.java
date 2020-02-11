package com.example.hibernateinheritancesaving.model.InheritanceTablePerClass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@ToString
@EqualsAndHashCode
public abstract class AbstractPart {

    @Id
    @GeneratedValue
    private Long id;

    private String producer;
}
