package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient       //配置eureka   的客户端
@EnableFeignClients      // 消费的另一种调用方式
@EnableCircuitBreaker   //  配置熔断
public class SpringApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationController.class,args);
    }
}