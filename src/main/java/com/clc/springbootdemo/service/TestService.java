package com.clc.springbootdemo.service;

import com.clc.springbootdemo.dao.TestMapper;
import com.clc.springbootdemo.model.AdProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<AdProject> getList(){
        return testMapper.getList();
    }
}
