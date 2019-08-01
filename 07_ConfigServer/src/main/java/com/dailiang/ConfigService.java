package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigService {

    public static void main(String[] args) {
        SpringApplication.run(ConfigService.class, args);
    }

}
