package com.beijing.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.beijing.consumer.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableDubbo
class ConsumerUserApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void testUser() {
        userService.userTicket();
    }

}
