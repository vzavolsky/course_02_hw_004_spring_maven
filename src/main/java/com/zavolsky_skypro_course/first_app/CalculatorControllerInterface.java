package com.zavolsky_skypro_course.first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorControllerInterface {
    @GetMapping(path = "/plus")
    String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    @GetMapping(path = "/minus")
    String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    @GetMapping(path = "/multiply")
    String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    @GetMapping(path = "/divide")
    String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2);
}
