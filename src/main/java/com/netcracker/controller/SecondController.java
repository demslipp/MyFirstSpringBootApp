package com.netcracker.controller;

import com.netcracker.bean.NewBean;
import com.netcracker.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecondController{

    @Autowired
    private NewBean newBean;

    @GetMapping("/test")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return newBean.toString();
    }
}
