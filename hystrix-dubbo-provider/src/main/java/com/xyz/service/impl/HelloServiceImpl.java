package com.xyz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xyz.service.HelloService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String s) {
        return "hello:"+s;
    }
}
