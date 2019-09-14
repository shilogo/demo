package com.shiquanxi.springbootday1;

import com.shiquanxi.springbootday1.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbootday1ApplicationTests {

    @Autowired
    Student  student;


    @Test
    public void contextLoads() {
        System.out.println(student.toString());
    }

}
