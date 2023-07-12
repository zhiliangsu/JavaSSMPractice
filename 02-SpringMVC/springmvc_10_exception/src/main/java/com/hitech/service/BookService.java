package com.hitech.service;

import com.hitech.domain.Book;

import java.util.List;

public interface BookService {
    /**
     * 新增
     *
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
