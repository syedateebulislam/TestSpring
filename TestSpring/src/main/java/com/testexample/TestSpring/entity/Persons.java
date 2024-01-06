package com.testexample.TestSpring.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Persons {

    @Id
    int personid;

    String lastname;

    String firstname;

    String address;

    String city;

}
