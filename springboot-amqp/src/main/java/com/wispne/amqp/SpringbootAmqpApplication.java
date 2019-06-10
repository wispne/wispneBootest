package com.wispne.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringbootAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAmqpApplication.class, args);
    }

}
