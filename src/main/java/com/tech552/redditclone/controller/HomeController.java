package com.tech552.redditclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by makerofapps on 2/2/20.
 */
@RestController
public class HomeController {


    //@RequestMapping(path = "/", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    @GetMapping
    public String home(){
        return "index";
    }
}
