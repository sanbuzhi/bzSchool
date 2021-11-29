package com.koushidai.bzschool.service.impl;

import com.koushidai.bzschool.dao.UserDao;
import com.koushidai.bzschool.dto.UserDTO;
import com.koushidai.bzschool.service.UserService;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    @Override
    public int updateUserInfo(UserDTO user) {
        if (null == user.getUid())
            return 0;
        return userDao.updateUserInfo(user);
    }

    @Override
    public UserDTO getUserInfoById(Integer uId) {
        return userDao.getUserInfoById(uId);
    }

    @Override
    public UserDTO login(String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password))
            return null;
        String pwd = username+"-"+password;
        UserDTO user = userDao.getUserInfoByCond(username, pwd);
        if (null == user)
            return null;
        return user;
    }


}
