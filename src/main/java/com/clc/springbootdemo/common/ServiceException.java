package com.clc.springbootdemo.common;

/**
 * service层抛出异常 方便定位问题位置
 */
public class ServiceException extends RuntimeException {
    public ServiceException(){}

    public ServiceException(String message){super(message);}
}
