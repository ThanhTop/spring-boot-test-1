package com.stackjava.demospring2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlle {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
