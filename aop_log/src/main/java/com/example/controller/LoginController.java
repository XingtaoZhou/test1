package com.example.controller;

import com.example.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping("/login")
    public String login(User user){
        //验证用户名密码不为空
        if (StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword())){
            return "请输入用户名密码！";
        }
        //用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUserName(),user.getPassword());

        try {
            //进行验证，捕获异常
            subject.login(usernamePasswordToken);
        }catch (UnknownAccountException e){
            log.error("用户名不存在！",e);
            return "用户名不存在！";
        }catch (AuthenticationException e){
            log.error("账号或密码错误！",e);
            return "账号或密码错误！";
        }catch (AuthorizationException e){
            log.error("没有权限！",e);
            return "没有权限！";
        }
        return "login success!";
    }

    @RequiresRoles("admin")
    @RequestMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin success";
    }

    @RequiresPermissions("query")
    @RequestMapping("/query")
    @ResponseBody
    public String query(){
        return "query success";
    }

    @RequiresPermissions("add")
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        return "add success";
    }

}

















