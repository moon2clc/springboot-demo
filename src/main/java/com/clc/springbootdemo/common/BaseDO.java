package com.clc.springbootdemo.common;

import lombok.Data;

import java.util.Date;

/**
 * 所有实体类基础字段
 */
@Data
public class BaseDO {
    private String id; //主键id
    private String createUserId; //创建人id
    private String createUserName; //创建人名称
    private Date createDate; //创建时间
    private String updateUserId; //修改人id
    private String updateUserName; //修改人名称
    private Date updateDate; //修改时间
    private Integer isDeleted = 0; //是否删除(默认0 删除1)
    private Integer version; //数据版本（乐观锁）
}
