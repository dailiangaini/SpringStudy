package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaProvider {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider.class, args);
    }

}
