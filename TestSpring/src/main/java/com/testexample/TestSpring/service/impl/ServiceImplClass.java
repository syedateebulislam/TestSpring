package com.testexample.TestSpring.service.impl;

import com.testexample.TestSpring.entity.Persons;
import com.testexample.TestSpring.repo.PersonsRepo;
import com.testexample.TestSpring.service.ServiceLayer;
import com.testexample.TestSpring.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Service
public class ServiceImplClass implements ServiceLayer {

    @Autowired
    PersonsRepo personsRepo;

    @Override
    public List<Persons> implMethods() {

        List<Persons> l1= personsRepo.findAll();

        return l1;

    }

    @Override
    public Persons findSpecificPerson(int pid) throws PersonNotFoundException {

        Persons l1= personsRepo.findByPersonid(pid);
        if(!ObjectUtils.isEmpty(l1)){
            return l1;
        }else throw new PersonNotFoundException("No Person data found in DB");

    }

    @ExceptionHandler(value=PersonNotFoundException.class)
    public String NoDataException(){
        return "NoDataException occurred";
    }
}
