package com.study.springbootswagger.myswagger;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.BeanParam;
import javax.ws.rs.core.Context;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api("user相關api")
@RequestMapping("user")
public class UserApi {
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    @ApiOperation(value = "增加user",notes = "notes：新增加一個user信息",response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "入参user",dataType = "User")
    })
    @ApiResponses({
            @ApiResponse(code = HttpURLConnection.HTTP_BAD_GATEWAY,message = "接口成功返回",response = User.class)
    })
    public String addUser(/*@ApiParam(value = "入參user") User user*/){

        return getUser().getId();
    }

    @RequestMapping(value = "addUsert",method = RequestMethod.POST)
    @ApiOperation(value = "增加usert",notes = "notes：新增加一個user信息t")
    public String addUser(@BeanParam User user){
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
