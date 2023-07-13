package com.hitech.controller;

import com.hitech.domain.Book;
import com.hitech.exception.BusinessException;
import com.hitech.exception.SystemException;
import com.hitech.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 统一每一个控制器方法返回值
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;


    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        // 模拟业务异常，包装成自定义异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要用你的技术挑战我的耐性!");
        }
        // 模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
        try {
            if (id == 2) {
                int i = 1 / 0;
            }
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时, 请重试!", e);
        }
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败, 请重试!";
        return new Result(code, msg, book);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败, 请重试!";
        return new Result(code, msg, bookList);
    }

}
