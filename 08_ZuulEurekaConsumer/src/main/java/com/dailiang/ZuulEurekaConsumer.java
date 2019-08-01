package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class ZuulEurekaConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaConsumer.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
