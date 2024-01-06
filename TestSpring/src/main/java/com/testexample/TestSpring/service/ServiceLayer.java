package com.testexample.TestSpring.service;

import com.testexample.TestSpring.entity.Persons;
import com.testexample.TestSpring.util.PersonNotFoundException;

import java.util.List;

public interface ServiceLayer {

    List<Persons> implMethods();

    Persons findSpecificPerson(int pid) throws PersonNotFoundException;

}
