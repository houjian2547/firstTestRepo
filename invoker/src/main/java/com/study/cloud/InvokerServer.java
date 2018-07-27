package com.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InvokerServer {
    public static void main(String[] args) {
        SpringApplication.run(InvokerServer.class, args);
        System.err.println("服务调用者启动完成!");
    }
}
