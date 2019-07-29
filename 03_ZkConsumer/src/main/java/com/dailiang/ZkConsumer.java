package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZkConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ZkConsumer.class, args);
    }

}
