package com.example.handle;


import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class MyExceptionHandle {

    @ExceptionHandler
    @ResponseBody
    public String ErrorHandle(AuthorizationException e){
        log.error("没有通过权限验证",e);
        return "没有通过权限验证";
    }

}











