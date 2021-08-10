package shop.Jarvis.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.Jarvis.app.demo.calculator.service.CalculatorService;

@RestController@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;
}
