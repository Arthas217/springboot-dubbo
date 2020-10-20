package com.beijing.consumer.control;

import com.beijing.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zc217
 * @Date 2020/10/20
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/ticket")
    public String testUser() {
        userService.userTicket();
        return "success";
    }
}
