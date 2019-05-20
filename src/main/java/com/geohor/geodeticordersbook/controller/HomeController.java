package com.geohor.geodeticordersbook.controller;

import com.geohor.geodeticordersbook.entity.User;
import com.geohor.geodeticordersbook.service.CurrentUser;
import org.springframework.http.HttpRequest;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@EnableWebSecurity
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
            { return "geo/geo";}

            case "gw":
            { return "gw/gw";}

            case "sub":
            { return "sub/sub";}

            default: return "home";

        }

    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "this is user id " +entityUser.getId() ;
    }

//    @GetMapping("/logout")
//    @ResponseBody
//    public String admin(HttpRequest httpRequest) {
//        return "/" ;
//    }





}
