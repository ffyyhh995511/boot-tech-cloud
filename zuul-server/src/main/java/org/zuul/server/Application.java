package org.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * TwoStepsFromJava Cloud -- Zuul Proxy 服务器
 *
 * @author CD826(CD826Dong@gmail.com)
 * @since 1.0.0
 */
@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
