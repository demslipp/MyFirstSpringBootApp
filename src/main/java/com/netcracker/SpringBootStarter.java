package com.netcracker;

import com.netcracker.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource("classpath:app-config.xml")
public class SpringBootStarter{
    public static void main(String[] args){
        ConfigurableApplicationContext context
                =SpringApplication.run(SpringBootStarter.class, args);

        Car ladaKalina=(Car) context.getBean("ladaKalina");
        Car ladaKalina2=(Car) context.getBean("ladaKalina");

        Car ladaVesta=(Car) context.getBean("ladaVesta");
        Car cayene=(Car) context.getBean("cayene");
    }
}
