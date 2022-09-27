package com.example.demo.ex;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/27
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 *@Auther 月鸟石 2022/9/27
 *联系方式(QQ)：3054578922
 *周二 
 *欢迎回家，主人
 */
@Slf4j
@RestControllerAdvice
@Component
public class GlobalException extends RuntimeException {

    @ExceptionHandler(value = UserInfoNullException.class)
    public String handleUserInfoNullException(UserInfoNullException e) {
        System.out.println(e.getClass());
        return "exception success";
    }

    @ExceptionHandler(value = Exception03.class)
    public String handleException03(Exception03 exception) {
        if (exception instanceof Exception02) {
            return "02";
        } else if (exception instanceof Exception01) {
            return "01";
        } else {
            return "系统内部错误";
        }
    }

    public GlobalException() {
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalException(Throwable cause) {
        super(cause);
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

/**
 *一切顺心
 */