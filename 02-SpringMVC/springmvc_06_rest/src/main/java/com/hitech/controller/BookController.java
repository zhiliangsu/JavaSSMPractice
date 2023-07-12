package com.hitech.controller;

import com.hitech.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller + ReponseBody
@RequestMapping("/books")
public class BookController {
    @PostMapping
    @ResponseBody
    public String save(@RequestBody Book book) {
        System.out.println("book save..." + book);
        return "{'module': 'book save'}";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete..." + id);
        return "{'module': 'book delete'}";
    }

    @PutMapping
    @ResponseBody
    public String update(@RequestBody Book book) {
        System.out.println("book update..." + book);
        return "{'module': 'book update'}";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById..." + id);
        return "{'module': 'book getById'}";
    }

    @GetMapping
    @ResponseBody
    public String getAll() {
        System.out.println("book getAll...");
        return "{'module': 'book getAll'}";
    }
}
