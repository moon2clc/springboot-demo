package com.clc.springbootdemo;

import com.clc.springbootdemo.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Test
    public void test1(){
        IdWorker idWorker = new IdWorker();
        System.out.println(idWorker.nextId());
    }

    @Test
    public void contextLoads() {
        System.out.println("test");
    }

}
