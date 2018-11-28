package service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.taotao.mapper")
@EnableDiscoveryClient
public class Springapplicationtwoclient {
    public static void main(String[] args) {
        SpringApplication.run(Springapplicationtwoclient.class,args);
    }
}
