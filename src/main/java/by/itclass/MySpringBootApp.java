package by.itclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MySpringBootApp {
    @GetMapping
    String home() {
        return "Hello World!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApp.class);
    }
}
