package com.hitech.controller;

import com.hitech.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${lesson}")
    private String lesson;
    @Value("${enterprise.age}")
    private Integer age;
    @Value("${enterprise.subject[0]}")
    private String subject_00;
    @Autowired
    private Environment environment;
    @Autowired
    private Enterprise enterprise;

    @GetMapping("{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println(lesson);
        System.out.println(age);
        System.out.println(subject_00);
        System.out.println("-------------------------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.subject[0]"));
        System.out.println("-------------------------------");
        System.out.println(enterprise);
        System.out.println(enterprise.getName());
        System.out.println(enterprise.getAge());
        System.out.println("-------------------------------");
        System.out.println("id==>" + id);
        return "Hello, spring boot!";
    }
}
