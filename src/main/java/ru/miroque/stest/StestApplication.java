package ru.miroque.stest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.event.EventListener;
//@EnableConfigurationProperties
@SpringBootApplication
public class StestApplication {
    public static void main(String[] args) {
        SpringApplication.run(StestApplication.class, args);
    }
}
