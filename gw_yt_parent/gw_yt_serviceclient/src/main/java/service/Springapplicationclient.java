package service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * service    实现类
 */
@SpringBootApplication
@MapperScan("com.taotao.mapper")
@EnableDiscoveryClient
public class Springapplicationclient {
    public static void main(String[] args) {
        SpringApplication.run(Springapplicationclient.class,args);
    }
}
