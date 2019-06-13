package com.peter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient        //本服务启动后会自动注册进eureka服务中
public class SpringcloudProviderDept8002 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8002.class, args);
    }

}