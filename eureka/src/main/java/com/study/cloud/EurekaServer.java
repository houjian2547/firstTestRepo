package com.study.cloud;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        // 读取控制台输入，决定使用哪个profiles
        Scanner scan = new Scanner(System.in);
        String profiles = scan.nextLine();
        new SpringApplicationBuilder(EurekaServer.class).profiles(profiles).run(args);
        System.err.println("注册中心启动完成 , profiles : " + profiles);
    }
}
