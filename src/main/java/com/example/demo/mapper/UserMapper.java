package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Param;

/**
 * @author liutf
 * @date 2020-03-24
 */
public interface UserMapper {
    UserBean getUserDetail(@Param("username") String username);
}
