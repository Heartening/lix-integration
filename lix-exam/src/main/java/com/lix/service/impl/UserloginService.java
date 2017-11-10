package com.lix.service.impl;

import com.lix.entity.Userlogin;
import com.lix.mapper.UserloginMapper;
import com.lix.service.IUserloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service("userloginService")
public class UserloginService implements IUserloginService{
    @Autowired
    private UserloginMapper userloginMapper;

    public Userlogin findByName(String userName) {
        Example example = new Example(Userlogin.class);
        example.createCriteria().andEqualTo("username", userName);

        return  userloginMapper.selectByExample(example).get(0);
    }
}
