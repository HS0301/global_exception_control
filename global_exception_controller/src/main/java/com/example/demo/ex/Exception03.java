package com.example.demo.ex;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/27
 */

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 *@Auther 月鸟石 2022/9/27
 *联系方式(QQ)：3054578922
 *周二 
 *欢迎回家，主人
 */

public class Exception03 extends GlobalException {

    public Exception03() {
    }

    public Exception03(String message) {
        super(message);
    }

    public Exception03(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception03(Throwable cause) {
        super(cause);
    }

    public Exception03(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

/**
 *一切顺心
 */