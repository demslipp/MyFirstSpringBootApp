package com.netcracker.controller;

import com.netcracker.bean.Car;
import com.netcracker.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @Qualifier("ladaGranta")
    @Autowired
    private Car car;

    @GetMapping("/car")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return car.toString();
    }
}
