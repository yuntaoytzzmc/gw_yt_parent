package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableConfigServer
@EnableEurekaClient
public class Springconfigtest {
    public static void main(String[] args) {
        SpringApplication.run(Springconfigtest.class,args);
    }
}
