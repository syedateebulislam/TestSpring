package com.testexample.TestSpring.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class InternalController {

@GetMapping("/v1")
    public String getValues(){
    log.info("inside getValues controller");
    return "test";
}

}
