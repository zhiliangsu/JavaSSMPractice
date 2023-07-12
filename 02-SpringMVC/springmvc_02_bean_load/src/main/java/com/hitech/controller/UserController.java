package com.hitech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {
    @RequestMapping("/save")
    public String save() {
        System.out.println("user save...");
        return "{'info':'springmvc'}";
    }
}
