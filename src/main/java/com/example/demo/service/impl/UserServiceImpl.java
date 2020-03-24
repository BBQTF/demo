package com.example.demo.service.impl;

import com.example.demo.bean.UserBean;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @author liutf
 * @date 2020-03-24
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    @Override
    public UserDto findUsersByLoginName(String username){
        UserBean bean = mapper.getUserDetail(username);
        if (bean != null)
        {
            return bean.transToDto(bean);
        }
        return null;
    }
}
