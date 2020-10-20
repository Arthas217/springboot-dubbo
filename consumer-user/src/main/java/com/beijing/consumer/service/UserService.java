package com.beijing.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.beijing.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @Author zc217
 * @Date 2020/10/20
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void userTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("买到票了:" + ticket);
    }
}
