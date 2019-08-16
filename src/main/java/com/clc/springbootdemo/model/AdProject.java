package com.clc.springbootdemo.model;

import com.clc.springbootdemo.common.BaseDO;
import lombok.Data;

import java.util.Date;

@Data
public class AdProject extends BaseDO {
    private String id;
    private String name;
    private Date startTime;
    private Date endTime;
}
