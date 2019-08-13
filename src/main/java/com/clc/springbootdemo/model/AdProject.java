package com.clc.springbootdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class AdProject {

    private String id;
    private String name;
    private Date starttime;
    private Date endtime;
}
