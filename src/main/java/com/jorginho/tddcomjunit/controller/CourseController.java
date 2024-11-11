package com.jorginho.tddcomjunit.controller;


import com.jorginho.tddcomjunit.Entity.Curse;
import com.jorginho.tddcomjunit.repository.CurseinMemoryRepository;
import com.jorginho.tddcomjunit.repository.CuserJpaRepository;
import com.jorginho.tddcomjunit.repository.CuserRepository;
import com.jorginho.tddcomjunit.services.CreateServicecurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/courses")
public class CourseController {

    @Autowired
    private CuserRepository repository;
    @PostMapping("/")
    private Curse createCourse(@RequestBody Curse curse) {
        CreateServicecurse createCurseService = new CreateServicecurse((CuserJpaRepository) repository);
        return createCurseService.execute(curse);
    }
}
