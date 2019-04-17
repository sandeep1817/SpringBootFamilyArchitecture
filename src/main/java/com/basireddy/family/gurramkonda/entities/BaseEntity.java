package com.basireddy.family.gurramkonda.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Column(name = "Id",nullable = false,columnDefinition = "bigint(40)")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "name")
    private  String name;

    @Column(name = "relationship")
    private String relation;

    @Column(name = "date_of_birth")
    private Date date;

    @Column(name = "gender")
    private String gender;
}
