package com.beijing.ticket.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.beijing.ticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * @Author zc217
 * @Date 2020/10/20
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "厉害了我的祖国";
    }
}
