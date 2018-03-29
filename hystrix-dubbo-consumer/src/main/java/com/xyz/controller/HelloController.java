package com.xyz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xyz.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
public class HelloController {
    private ExecutorService executorService= Executors.newFixedThreadPool(50);
    @Reference()
    private HelloService helloService;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        for(int i=0;i<50;i++){
           executorService.submit(new Runnable() {
               @Override
               public void run() {
                 for(int j=0;j<100000;j++){
                   try {
                       String ret=helloService.hello(String.valueOf(j));
                   }catch (Exception e){
                        e.printStackTrace();
                   }
                 }
               }
           });
        }
        return "ok";

    }
}
