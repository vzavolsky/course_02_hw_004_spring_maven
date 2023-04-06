package com.zavolsky_skypro_course.first_app;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greetings() {
        return "Welcome to the calculator!";
    }

    public String plus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    public String minus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    public String multiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) return "Деление на ноль запрещено.";
        return String.valueOf(num1 / num2);
    }

    public String show(int num1, int num2) {
        return String.format("num1 = \"%s\";\nnum2 = \"%s\"", num1, num2);
    }
}
