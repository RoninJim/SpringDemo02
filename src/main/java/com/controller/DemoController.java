package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/home")
public class DemoController {
        @RequestMapping("/index")
        public  String index(){
                return  "index";
        }
}
