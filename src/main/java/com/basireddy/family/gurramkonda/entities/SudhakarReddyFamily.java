package com.basireddy.family.gurramkonda.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity@Table(name = "sudhakarreddy_family")
@Setter@Getter@NoArgsConstructor
public class SudhakarReddyFamily extends BaseEntity implements Serializable {
   /* @Column(name = "Id",nullable = false,columnDefinition = "bigint(40)")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;


    @Column(name = "name")
    private  String name;

    @Column(name = "relationship")
    private String relation;

    @Column(name = "date_of_birth")
    private Date date;

    @Column(name = "gender")
    private String gender;*/

    SudhakarReddyFamily(String name, String relation, Date date, String gender){
        setName(name);
        setDate(date);
        setGender(gender);
        setRelation(relation);
    }
}
