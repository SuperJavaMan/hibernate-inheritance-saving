package com.example.hibernateinheritancesaving.model.InheritanceJoined;

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
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "prod_description")
@Data
@ToString
@EqualsAndHashCode
public abstract class AbstractProduct {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
