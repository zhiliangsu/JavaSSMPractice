package com.hitech.controller;

import com.hitech.exception.BusinessException;
import com.hitech.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //@ExceptionHandler用于设置当前处理器类对应的异常类型
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,ex对象发送给开发人员
        return new Result(exception.getCode(), exception.getMessage(), null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception) {
        return new Result(exception.getCode(), exception.getMessage(), null);
    }

    // 除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception) {
        exception.printStackTrace();
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_ERR, "系统繁忙,请稍后再试!", null);
    }

}
