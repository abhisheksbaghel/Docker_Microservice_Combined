package com.Services.UserService.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String sayHi()
    {
        return "Hi from user service";
    }

    @PostMapping("/{name}")
    public String callName(@PathVariable String nm)
    {
        return "User service got your name "+nm;
    }
}
