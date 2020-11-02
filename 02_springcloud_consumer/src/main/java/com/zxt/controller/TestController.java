package com.zxt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
        ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8081/test",String.class);
        //响应编码200 404
        System.out.println(result.getStatusCode());
        //响应头
        System.out.println(result.getHeaders());
        //具体响应信息，具体类型根据getForEntity的第二个参数
        String body = result.getBody();

        return "第一个springcloud服务消费者。"+body;
    }

}














