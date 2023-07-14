package com.hitech2;

import com.hitech.Springboot07TestApplication;
import com.hitech.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot07TestApplication.class)
class Springboot07TestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void testSave() {
        bookService.save();
    }

}
