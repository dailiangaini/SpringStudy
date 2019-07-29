package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaService {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService.class, args);
    }

}
