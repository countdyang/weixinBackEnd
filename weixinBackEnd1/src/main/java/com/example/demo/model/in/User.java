package com.example.demo.model.in;

import java.util.Date;

/**
 * Created by count on 2018/5/24.
 */
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    // Getter Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}
