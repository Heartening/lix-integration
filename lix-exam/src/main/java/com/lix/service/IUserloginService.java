package com.lix.service;

import com.lix.entity.Userlogin;

public interface IUserloginService {
    Userlogin findByName(String userName);
}
