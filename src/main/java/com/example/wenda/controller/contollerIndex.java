package com.example.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class contollerIndex {

    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index() {

        return "Hello,New Spring";
    }
}