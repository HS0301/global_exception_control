package com.example.demo.service.impl;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/27
 */

import com.example.demo.ex.Exception01;
import com.example.demo.ex.Exception02;
import com.example.demo.ex.UserInfoNullException;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 *
 *@Auther 月鸟石 2022/9/27
 *联系方式(QQ)：3054578922
 *周二 
 *欢迎回家，主人
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String testService() {
        throw new Exception02("test");
    }
}

/**
 *一切顺心
 */