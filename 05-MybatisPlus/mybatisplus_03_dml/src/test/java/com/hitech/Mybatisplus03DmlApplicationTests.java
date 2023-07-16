package com.hitech;

import com.hitech.dao.UserDao;
import com.hitech.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        // 设置主键ID的值
        // user.setId(666L);
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        /* List<Long> list = new ArrayList<>();
        // 删除指定多条数据
        list.add(1680469083373289474L);
        list.add(1680469504506564609L);
        userDao.deleteBatchIds(list); */
        userDao.deleteById(2L);

    }

    @Test
    void testFind() {
        System.out.println(userDao.selectList(null));
    }

    @Test
    void testSelecAll() {
        userDao.selectAll();
    }

    @Test
    void testGetById() {
        List<Long> list = new ArrayList<>();
        // 查询指定多条数据v
        list.add(1L);
        list.add(2L);
        list.add(3L);
        userDao.selectBatchIds(list);

    }

    @Test
    void testUpdate() {
        /* User user = new User();
        user.setId(3L);
        user.setName("Jock666");
        user.setVersion(1); */
        // 1.先通过要修改的数据id将当前数据查询出来
        User userA = userDao.selectById(3L);
        User userB = userDao.selectById(3L);
        // 2.将要修改的属性逐一设置进去

        userA.setName("Jock AAA");
        userDao.updateById(userA);
        userB.setName("Jock BBB");
        userDao.updateById(userB);
    }

    @Test
    void contextLoads() {
    }

}
