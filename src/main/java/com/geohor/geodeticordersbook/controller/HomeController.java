package com.geohor.geodeticordersbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String home() {
        return "home2";
    }

    @GetMapping("/abc")
    @ResponseBody
    public String abc() {
        return "to jest abc";
    }



}
