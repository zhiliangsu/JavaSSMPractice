package com.hitech;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hitech.dao.UserDao;
import com.hitech.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {
    @Autowired
    private UserDao userDao;

    // 新增
    @Test
    public void testSave() {
        User user = new User();
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }

    // 删除
    @Test
    public void testDelete() {
        userDao.deleteById(1680063443324715009L);
    }

    // 修改
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1L);
        user.setName("Tom888");
        user.setPassword("tom888");
        userDao.updateById(user);
    }

    // 查询: 根据ID查询
    @Test
    public void testGetById() {
        User user = userDao.selectById(2L);
        System.out.println(user);
    }

    // 查询: 查询全部
    @Test
    public void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

    // 查询: 分页查询
    @Test
    public void testSelectPage() {
        // 1.创建Ipage分页对象, 设置分页参数, 1为当前页码, 3为每页显示的的记录数
        IPage<User> page = new Page<>(2, 3);
        // 2.执行分页查询
        userDao.selectPage(page, null);
        // 3.获取分页结果
        System.out.println("当前页码值: " + page.getCurrent());
        System.out.println("每页显示数: " + page.getSize());
        System.out.println("总页数: " + page.getPages());
        System.out.println("总条数: " + page.getTotal());
        System.out.println("数据: " + page.getRecords());
    }

    @Test
    void contextLoads() {
    }

}
