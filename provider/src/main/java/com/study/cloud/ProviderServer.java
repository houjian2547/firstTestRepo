package com.study.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = { "com.study"})
@MapperScan("com.study.cloud.dao")
//@EnableTransactionManagement
//@EnableAutoConfiguration
public class ProviderServer {

    public static void main(String[] args) {
        // 读取控制台输入的端口，避免端口冲突
        Scanner scan = new Scanner(System.in);
        String port = scan.nextLine();
        new SpringApplicationBuilder(ProviderServer.class).properties(
                "server.port=" + port).run(args);
        System.err.println("服务提供者启动完成! , 端口号 : " + port);
    }

}
