package com.testexample.TestSpring.repo;

import com.testexample.TestSpring.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PersonsRepo extends JpaRepository<Persons , Integer> {
//10.229.9.69
}
