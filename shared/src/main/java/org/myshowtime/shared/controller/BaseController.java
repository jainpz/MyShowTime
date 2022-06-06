package org.myshowtime.shared.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String index() {
        return "Welcome to My Show Time! Book your tickets hassle free.";
    }


}