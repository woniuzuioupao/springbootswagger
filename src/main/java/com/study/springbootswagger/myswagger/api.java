package com.study.springbootswagger.myswagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Api("user相關api")
@RequestMapping("user")
public class api {
    @RequestMapping(value = "addUser",method = RequestMethod.GET)
    @ApiOperation(value = "增加user",notes = "notes：新增加一個user信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "入參user",name = "user",
                    required = true,paramType = "query",dataType = "User"
            ,example = "{id:1,name:hanyan,hobbyList:['hobby1','hobby2']}"),
    })
    public String addUser(User user){
        return "增加user成功";
    }

}
