package com.example.demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControll {
    @PostMapping("/employees")
  String newEmployee() {
    return "Testing the Application";
  }
}
