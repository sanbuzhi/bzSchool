package com.koushidai.bzschool.service;

import com.koushidai.bzschool.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 更改用戶信息
     */
    int updateUserInfo(UserDTO user);

    /**
     * 根据用户id获取用户信息
     */
    UserDTO getUserInfoById(Integer uId);


    /**
     * 用户登录
     */
    UserDTO login(String username, String password);

}
