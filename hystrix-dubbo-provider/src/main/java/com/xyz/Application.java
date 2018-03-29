/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.xyz;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//SpringBoot启动核心
@EnableDubboConfiguration
public class Application  {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
