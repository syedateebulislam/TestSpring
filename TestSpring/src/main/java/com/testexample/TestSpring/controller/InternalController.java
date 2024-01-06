package com.testexample.TestSpring.controller;


import com.testexample.TestSpring.entity.Persons;
import com.testexample.TestSpring.service.ServiceLayer;
import com.testexample.TestSpring.util.PersonNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/api")
public class InternalController {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping("/v1")
    public List<Persons> getValues(){
    log.info("inside getValues controller");
    List<Persons> l1 = new ArrayList<>();
    l1 = serviceLayer.implMethods();
    return l1;
}

    @PostMapping("/v1/{pid}")
    public Persons fetchPersonById(@PathVariable("pid")int pid){
        log.info("inside getValues controller");
        Persons l1 = new Persons();
        try {
            l1 = serviceLayer.findSpecificPerson(pid);
        } catch (PersonNotFoundException e) {
            log.error("error occurred cause:{} , message:{}",e.getCause(), e.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }


        return l1;
    }

}
