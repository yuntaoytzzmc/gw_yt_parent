package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/***
 *
 * zuul  网关
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableZuulProxy
@EnableEurekaClient
public class springapplicationzuul {
    public static void main(String[] args) {
        SpringApplication.run(springapplicationzuul.class,args);
    }
}
