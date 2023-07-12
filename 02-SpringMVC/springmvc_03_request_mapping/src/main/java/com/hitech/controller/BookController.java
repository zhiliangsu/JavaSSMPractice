package com.hitech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    public String save() {
        System.out.println("book save...");
        return "{'module': 'book save'}";
    }
}
