package com.study.springbootswagger.myswagger;

import java.io.Serializable;
import java.util.List;

public class UserNoModel implements Serializable {

    private static final long serialVersionUID = -5981346307616396561L;
    private String id;
    private String name;
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
