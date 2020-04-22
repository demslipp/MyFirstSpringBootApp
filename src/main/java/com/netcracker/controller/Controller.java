package com.netcracker.controller;

import com.netcracker.bean.Car;
import com.netcracker.bean.NewBean;
import com.netcracker.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mytry")
public class Controller{

    @Autowired
    private NewBean newBean;

    @Qualifier("ladaGranta")
    @Autowired
    private Car car;

    @GetMapping("/test")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return newBean.toString();
    }
}
