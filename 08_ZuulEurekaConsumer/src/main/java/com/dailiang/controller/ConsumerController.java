package com.dailiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author dailiang
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/geConsumer")
    public String geConsumer() {
        // order 使用rpc 远程调用技术 调用
        String url = "http://zuul/geProvider";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("消费服务调用提供服务,url:" + url);
        System.out.println("消费服务调用提供服务,result:" + result);
        return result;
    }

    @RequestMapping("/geConsumer2")
    public String geConsumer2() {
        // order 使用rpc 远程调用技术 调用
        String url = "http://zuul-dynamic/geProvider";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("消费服务调用提供服务,url:" + url);
        System.out.println("消费服务调用提供服务,result:" + result);
        return result;
    }

    @RequestMapping("/geConsumer3")
    public String geConsumer3() {
        // order 使用rpc 远程调用技术 调用
        String url = "http://zuul-nacos/geProvider";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("消费服务调用提供服务,url:" + url);
        System.out.println("消费服务调用提供服务,result:" + result);
        return result;
    }


}
