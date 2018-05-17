package com.study.springbootswagger.myswagger;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api("user相關api")
@RequestMapping("user")
public class UserApi {
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    @ApiOperation(value = "增加user",notes = "notes：新增加一個user信息")
    public String addUser(@ApiParam(value = "入參user") User user){
        return "增加user成功";
    }

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    @ApiOperation(value = "獲取user",notes = "notes：獲取一個user信息")
    public User getUser(){
        List<String> list=new ArrayList();
        list.add("football");
        list.add("basketball");
        return new User("1","hanyan",list);
    }
}
