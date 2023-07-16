package com.hitech;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hitech.dao.UserDao;
import com.hitech.domain.User;
import com.hitech.domain.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    /* // 查询: 构建条件查询方式一 ==> QueryWrapper
    @Test
    public void testGetAll() {
        QueryWrapper qw = new QueryWrapper();
        qw.lt("age", 18);
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);
    } */

    /* // 查询: 构建条件查询方式二 ==> QueryWrapper的基础上使用lambda
    @Test
    public void testGetAll() {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.lambda().lt(User::getAge, 10);
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);
    } */

    /* // 查询: 构建条件查询方式三 ==> LambdaQueryWrapper
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.lt(User::getAge, 10);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /* // 需求:查询数据库表中，年龄在10岁到30岁之间的用户信息
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.lt(User::getAge, 30).gt(User::getAge, 10); // 链式编程
        // lqw.lt(User::getAge, 30);
        // lqw.gt(User::getAge, 10);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /* // 需求:查询数据库表中，年龄小于10或年龄大于30的数据
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30); // 链式编程
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /* // null判定
    @Test
    public void testGetAll() {
        // 模拟页面传过来的查询数据
        UserQuery uq = new UserQuery();
        uq.setAge(10);
        uq.setAge2(30);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
         *//* if (uq.getAge2() != null) {
            lqw.lt(User::getAge, uq.getAge2());
        }
        if (uq.getAge() != null) {
            lqw.gt(User::getAge, uq.getAge());
        } *//*
        lqw.lt(uq.getAge2() != null, User::getAge, uq.getAge2())
                .gt(uq.getAge() != null, User::getAge, uq.getAge());
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /**
     * 查询指定字段
     */
    /* @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.select(User::getId, User::getName, User::getAge);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /* @Test
    public void testGetAll() {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.select("id", "name", "age", "tel");
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);
    } */

    /* // 需求:聚合函数查询，完成count、max、min、avg、sum的使用
    @Test
    public void testGetAll() {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        // qw.select("count(*) as count");
        // qw.select("max(age) as maxAge");
        // qw.select("min(age) as minAge");
        // qw.select("sum(age) as sumAge");
        qw.select("avg(age) as avgAge");
        List<Map<String, Object>> userList = userDao.selectMaps(qw);
        System.out.println(userList);
    } */

    /* @Test
    public void testGetAll() {
        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.select("count(*) as count,tel").groupBy("tel");
        List<Map<String, Object>> userList = userDao.selectMaps(qw);
        System.out.println(userList);
    } */

    /* // 需求:根据用户名和密码查询用户信息
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.eq(User::getName, "Jerry").eq(User::getPassword, "jerry");
        User userList = userDao.selectOne(lqw);
        System.out.println(userList);
    } */

    /* // 需求:对年龄进行范围查询，使用lt()、le()、gt()、ge()、between()进行范围查询
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.between(User::getAge, 10, 30);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    /* // 需求:查询表中name属性的值以`J`开头的用户信息,使用like进行模糊查询
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        // lqw.like(User::getName, "J");
        // lqw.likeLeft(User::getName, "J");
        lqw.likeRight(User::getName, "J");
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    } */

    // 需求:查询所有数据，然后按照id降序
    @Test
    public void testGetAll() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        /* condition ：条件，返回boolean，当condition为true，进行排序，如果为false，则不排序
           isAsc:是否为升序，true为升序，false为降序
           columns：需要操作的列 */
        lqw.orderBy(true, false, User::getId);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    }

    @Test
    void contextLoads() {
    }

}
