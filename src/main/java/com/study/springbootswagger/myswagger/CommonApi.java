package com.study.springbootswagger.myswagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "基本類型的api")
@RequestMapping("common")
@RestController
public class CommonApi {

    @RequestMapping(value = "addString",method = RequestMethod.POST)
    @ApiOperation(value = "增加字符串",notes = "note:此為增加字符串接口")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "入參text",name = "text",paramType = "String")
    })
    public String addString(String text){
        return "增加字符串成功";
    }
    @RequestMapping(value = "delString",method = RequestMethod.DELETE)
    @ApiOperation(value = "刪除字符串",notes = "note:此為刪除字符串接口")
    public String delString(){
        return "刪除字符串成功";
    }

}
