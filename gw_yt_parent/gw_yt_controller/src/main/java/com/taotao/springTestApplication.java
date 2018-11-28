package com.taotao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RestController;;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient       //配置eureka   的客户端
@EnableFeignClients      // 消费的另一种调用方式
@EnableCircuitBreaker   //  配置熔断
public class springTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(springTestApplication.class,args);
    }
}