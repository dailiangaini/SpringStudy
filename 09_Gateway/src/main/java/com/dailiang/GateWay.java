package com.dailiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

/**
 * @author dailiang
 * @Date: 2019-07-29 12:08
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class GateWay {

    public static void main(String[] args) {
        SpringApplication.run(GateWay.class, args);
    }

   @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(t -> t.path("/hello")
                        .and()
                        .uri("http://localhost:8080"))
                .build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder) {
        Function<PredicateSpec, Route.AsyncBuilder> fn = new Function<PredicateSpec, Route.AsyncBuilder>() {

            @Override
            public Route.AsyncBuilder apply(PredicateSpec t) {
                t.path("/app/**");
                return t.uri("http://eureka-provider");
            }
        };
        return builder.routes().route(fn).build();
    }
}
