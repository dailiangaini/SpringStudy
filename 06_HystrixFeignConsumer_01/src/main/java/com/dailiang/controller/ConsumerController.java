package com.dailiang.controller;

import com.dailiang.api.ProviderFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @Autowired
    private ProviderFeign providerFeign;

    @RequestMapping("/geConsumer")
    public String geConsumer() {
        // order 使用rpc 远程调用技术 调用
        String memberUrl = "http://eureka-provider/geProvider";
        String result = restTemplate.getForObject(memberUrl, String.class);
        System.out.println("消费服务调用提供服务,result:" + result);
        return result;
    }

    @HystrixCommand(fallbackMethod = "consumerFallback")
    @RequestMapping("/geConsumerByFeign")
    public String geConsumerByFeign() {
        return providerFeign.geProvider();
    }

    @RequestMapping("/consumerFallback")
    public String consumerFallback() {
        return "consumerFallback";
    }

}
