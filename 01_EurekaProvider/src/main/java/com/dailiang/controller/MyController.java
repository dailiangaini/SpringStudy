package com.dailiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dailiang
 */
@RestController
public class MyController {

    @RequestMapping("/geProvider")
    public String geProvider() {
        return "this is geProvider";
    }

}
