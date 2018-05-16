package com.study.springbootswagger.myswagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = 7440736786435014032L;
    @ApiModelProperty(value = "user的id",name = "id")
    private String id;
    @ApiModelProperty(value = "user的name",name = "name")
    private String name;
    @ApiModelProperty(value ="user的hobby列表",name = "hobbyList")
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
}
