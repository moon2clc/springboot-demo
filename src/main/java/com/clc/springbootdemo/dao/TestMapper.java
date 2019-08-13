package com.clc.springbootdemo.dao;

import com.clc.springbootdemo.model.AdProject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    List<AdProject> getList();
}
