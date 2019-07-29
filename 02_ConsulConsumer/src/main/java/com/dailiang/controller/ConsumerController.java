package com.dailiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * @author dailiang
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @RequestMapping("/geConsumer")
    public String geConsumer() {
        //loadBalancer ==> 不支持Consul??
      /*  ServiceInstance serviceInstance = loadBalancer.choose("consul-provider");
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());*/


        List<ServiceInstance> instances = discoveryClient.getInstances("consul-provider");
        if(null != instances && instances.size() > 0){
            ServiceInstance serviceInstance = instances.get(0);
            // order 使用rpc 远程调用技术 调用
            String url = serviceInstance.getUri().toString() + "/geProvider";
            String result = restTemplate.getForObject(url, String.class);
            System.out.println("消费服务调用提供服务,result:" + result);
            return result;

        }
        return null;
    }


    @RequestMapping("/getServiceUrl")
    public List<String> getServiceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("consul-provider");
        List<String> services = new ArrayList<>();
        for (ServiceInstance serviceInstance : list) {
            if (serviceInstance != null) {
                services.add(serviceInstance.getUri().toString());
            }
        }
        return services;
    }

}
