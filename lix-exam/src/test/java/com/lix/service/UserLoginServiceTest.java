package com.lix.service;

import com.lix.entity.Userlogin;
import com.lix.mapper.UserloginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.entity.Example;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/exam-dao.xml")
public class UserLoginServiceTest {
    @Autowired
    private UserloginMapper userloginMapper;

    @Test
    public void test() {

        //     public Userlogin findByName(String userName) {
        Example example = new Example(Userlogin.class);
        example.createCriteria().andEqualTo("username", "admin");

        System.out.println(userloginMapper.selectByExample(example).get(0));
    }

}
