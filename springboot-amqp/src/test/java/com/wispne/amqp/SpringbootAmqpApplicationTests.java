package com.wispne.amqp;

import com.wispne.amqp.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    //direct方式发送
    public void contextLoads() {
        Map<String,Object> map=new HashMap<>();
        map.put("msg","这是第一个消息");
        map.put("data", Arrays.asList("hello",123,true));
        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);
    }
    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o.getClass());
        System.out.println(o);
    }
    //广播方式发送
    @Test
    public void sendMsg(){
        rabbitTemplate.convertAndSend("exchange.fanout","",new Book("红楼梦","曹雪芹"));

    }

}
