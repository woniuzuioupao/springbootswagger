package com.study.springbootswagger.noswagger;

import com.study.springbootswagger.myswagger.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@Api("noswagger接口")
@RequestMapping("no")
public class NoSwaggerAPI {

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    @ApiOperation(value = "增加user",notes = "notes：新增加一個user信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "入参user",dataType = "User")
    })
    public String addUser(/*@ApiParam(value = "入參user") User user*/){

        return getUser().getId();
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
