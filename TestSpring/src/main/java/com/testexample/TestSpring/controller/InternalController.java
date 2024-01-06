package com.testexample.TestSpring.controller;


import com.testexample.TestSpring.entity.Persons;
import com.testexample.TestSpring.repo.PersonsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class InternalController {


    @Autowired
    PersonsRepo personsRepo;

@GetMapping("/v1")
    public String getValues(){
    log.info("inside getValues controller");

    List<Persons> l1= personsRepo.findAll();
    l1.stream().forEach(System.out::println);
    return "test";
}

}
