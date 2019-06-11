package com.wispne.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class TicketSeriviceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "电影票#1";
    }
}
