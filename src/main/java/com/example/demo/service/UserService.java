package com.example.demo.service;

import com.example.demo.dto.UserDto;

/**
 * @author liutf
 * @date 2020-03-24
 */
public interface UserService {
    UserDto findUsersByLoginName(String username);
}
