package io.codingdojo.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

@RequestMapping("/")
public class HelloHuman {
    public static void main(String[] args) {
        SpringApplication.run(HelloHuman.class, args);
    }

    @RequestMapping("")
    public String index(@RequestParam(value="name", required = false) String firstName) {
        if (firstName != null) {
            return String.format("Hello %s!", firstName);
        } else {
            return "Hello Human!";
        }
    }
}
