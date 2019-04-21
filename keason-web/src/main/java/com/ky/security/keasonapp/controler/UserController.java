package com.ky.security.keasonapp.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get/{id}")
    public String getUser(@PathVariable("id") String id) {
        return "{\"id\":\"" + id + "\"}";
    }
}
