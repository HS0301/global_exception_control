package com.example.demo.controller;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/27
 */

import com.example.demo.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 *@Auther 月鸟石 2022/9/27
 *联系方式(QQ)：3054578922
 *周二 
 *欢迎回家，主人
 */
@Slf4j
@RestController
@RequestMapping("test")
public class MyController {


    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("test")
    public String test() {
        System.out.println("已执行");
        String s = userService.testService();
        return s;
    }

}

/**
 *一切顺心
 */