package com.example.aspect;


import com.example.utils.DateTimeUtil;
import com.example.vo.controllerLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
@Slf4j
public class LogAspect {

    //拦截Controller，打印日志
    @Pointcut("execution(* com.example.controller..*.*(..))")
    public void controllerMethod(){

    }

    @Before( "controllerMethod()" )
    public void beforeController(){

        //接受数据，封装起来，输出日志

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        controllerLog cLog = new controllerLog();
        cLog.setIp(request.getRemoteAddr());
        cLog.setMethod(request.getMethod());
        cLog.setTime(DateTimeUtil.getSysTime());

        log.info(cLog.toString());

    }

}
