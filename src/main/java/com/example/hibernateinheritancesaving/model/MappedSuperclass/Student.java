package com.example.hibernateinheritancesaving.model.MappedSuperclass;

import lombok.*;

import javax.persistence.Entity;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {

    private String specialization;

}
