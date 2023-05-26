package com.Services.AdminService.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello from Admin Service";
    }

    @PostMapping("/{name}")
    public String sayName(@PathVariable String nm)
    {
        return "Admin Service got your name "+nm;
    }

}