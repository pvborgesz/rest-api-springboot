package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }
}
