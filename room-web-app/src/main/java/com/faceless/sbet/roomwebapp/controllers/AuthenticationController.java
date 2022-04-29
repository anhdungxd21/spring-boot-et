package com.faceless.sbet.roomwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dungla
 */
@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }


}
