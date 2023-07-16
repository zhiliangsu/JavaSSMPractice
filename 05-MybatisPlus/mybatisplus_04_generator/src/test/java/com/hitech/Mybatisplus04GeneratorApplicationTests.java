package com.hitech;

import com.hitech.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatisplus04GeneratorApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {
        System.out.println(userService.list());
    }

    @Test
    void contextLoads() {
    }

}
