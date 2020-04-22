package com.netcracker.controller;

import com.netcracker.bean.Car;
import com.netcracker.model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    private final Car car1;

    public Controller(Car car1){
        this.car1=car1;
    }

    @GetMapping("/car")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return car1.toString();
    }
}
