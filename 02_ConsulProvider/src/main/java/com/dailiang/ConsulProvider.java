package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProvider {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider.class, args);
    }

}
