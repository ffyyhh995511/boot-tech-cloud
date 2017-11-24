package org.mall.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * TwoStepsFromJava Cloud -- Mall Web Project
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */

@EnableCircuitBreaker
@EnableFeignClients(basePackages = "org.**")
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
