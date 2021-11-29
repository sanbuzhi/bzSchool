package com.koushidai.bzschool.dao;


import com.koushidai.bzschool.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    /**
     * 根据用id查找用户
     * @param uId
     * @return
     */
    UserDTO getUserInfoById(@Param("uid") Integer uId);

    /**
     * 根据用户名密码查找用户
     * @param username
     * @param password
     * @return
     */
    UserDTO getUserInfoByCond(@Param("username") String username, @Param("password") String password);

    /**
     * 更改用户
     * @param user
     * @return
     */
    int updateUserInfo(UserDTO user);
}
