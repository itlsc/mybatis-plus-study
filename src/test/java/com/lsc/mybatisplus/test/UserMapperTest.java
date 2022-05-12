package com.lsc.mybatisplus.test;

import com.lsc.mybatisplus.entity.User;
import com.lsc.mybatisplus.mapper.UserMapper;
import com.lsc.mybatisplus.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;


    @Test
    public void testSelect() {
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user);
        }
    }

//    @Test
//    public void testInsert() {
//        User user = new User();
//        user.setAge(22);
//        user.setName("李二广");
//        user.setEmail("17sad3515@qq.com");
//        userMapper.insert(user);
//    }
//
//    /**
//     * 分页查询
//     */
//
//    @Test
//    public void selectPage(){
//        QueryWrapper<User> queryWrapper = new QueryWrapper();
//        queryWrapper.gt("age",20);
//        Page<User> page = new Page<>(1, 1);
//        IPage<User> iPage = userMapper.selectPage(page, queryWrapper);
//        System.out.println("数据总条数：" + iPage.getTotal());
//        System.out.println("总⻚数：" + iPage.getPages());
//        List<User> users = iPage.getRecords();
//        for (User user : users) {
//            System.out.println("user = " + user);
//        }
//    }
//
//
//    @Test
//    public void testSelectPage() {
//        QueryWrapper<User> wrapper = new QueryWrapper<User>();
//        wrapper.gt("age", 20); //年龄⼤于20岁
//        Page<User> page = new Page<>(1,2);
//        //根据条件查询数据
//        IPage<User> iPage = this.userMapper.selectPage(page, wrapper);
//        System.out.println("数据总条数：" + iPage.getTotal());
//        System.out.println("总⻚数：" + iPage.getPages());
//        List<User> users = iPage.getRecords();
//        for (User user : users) {
//            System.out.println("user = " + user);
//        }
//    }
}
