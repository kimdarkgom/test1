package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KaController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/a")
    public String aboard(){
        return "aboard";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/foodwrite")
    public String foodwrite(){
        return "foodwrite";
    }
    @GetMapping("/view")
    public String view(){
        return "view";
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }
    @GetMapping("/see")
    public String see(){
        return "see";
    }
}
