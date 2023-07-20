package com.bwan.copliot.Main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // change to @RequestMapping("/index") if you want to use index as the home page
    @GetMapping("/")
    public String index() {

        return "index";
    }

}
