package com.beijing.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ConsumerUserApplication {

    /**
     * 1. 引入dubbo.zkk客户端
     * 2. 配置文件
     * 3. 添加提供服务的注解
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }

}
