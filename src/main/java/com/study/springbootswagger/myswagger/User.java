package com.study.springbootswagger.myswagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;
import java.io.Serializable;
import java.util.List;
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = 7440736786435014032L;
    @QueryParam("id")
    @ApiModelProperty(value = "user的id",name = "id",example = "1",required = true)
    @NotNull
    private String id;
    @ApiModelProperty(value = "user的name",name = "name",example = "hanyan",required = true)
    @QueryParam("name")
    @NotNull
    private String name;
    @ApiModelProperty(value ="user的hobby列表",name = "hobbyList",example ="['看書','畫畫']",required = true)
    @QueryParam("hobbyList")
    @NotNull
    List<String> hobbyList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public User(String id, String name, List<String> hobbyList) {
        this.id = id;
        this.name = name;
        this.hobbyList = hobbyList;
    }
}
