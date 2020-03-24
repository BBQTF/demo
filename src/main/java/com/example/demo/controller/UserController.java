package com.example.demo.controller;

import com.example.demo.common.ResultVo;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author liutf
 * @date 2020-03-24
 */
@RestController
@RequestMapping("/system/user")
@Api("用户")
public class UserController {
    @Resource
    private UserService service;

    @GetMapping("/queryByLoginName")
    @ApiOperation("根据登录名查询用户信息")
    public ResultVo findUsersByLoginName(@RequestParam String username){
        ResultVo resultVo = new ResultVo();
        try{
            UserDto dto = service.findUsersByLoginName(username);
            resultVo.setData(dto);
        }catch (Exception e){
            e.printStackTrace();
            resultVo.setCode(1);
        }
        return resultVo;
    }
}
