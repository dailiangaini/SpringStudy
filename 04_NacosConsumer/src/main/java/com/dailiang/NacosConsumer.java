package com.dailiang;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Date: 2019-07-26 16:38
 * @Description:
 */
@SpringBootApplication
public class NacosConsumer {

     public static void main(String[] args) {
          SpringApplication.run(NacosConsumer.class, args);
     }

     @LoadBalanced
     @Bean
     public RestTemplate restTemplate() {
          return new RestTemplate();
     }

     @Bean
     public IRule ribbonRule(){
          return new RandomRule();
     }
}
