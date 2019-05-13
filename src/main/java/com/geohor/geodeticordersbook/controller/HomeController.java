package com.geohor.geodeticordersbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String home() {
        return "home";
    }

    @GetMapping("/{type}")
    public String accesTester(@PathVariable String type) {
        switch (type)
        {
            case "geo":
            { return "/geo/geo";}

            case "gw":
            { return "/gw/gw";}

            case "sub":
            { return "/sub/sub";}

            default: return "home";

        }

    }





}
