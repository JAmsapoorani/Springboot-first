package com.javaguides.Springbootfirst;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String  welcome()
    {
        return "welcome to Spring ";
    }
}
