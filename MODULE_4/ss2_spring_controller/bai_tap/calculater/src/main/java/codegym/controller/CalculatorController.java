package codegym.controller;

import codegym.service.ICalculaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    ICalculaterService calculaterService;

    @GetMapping ("/save")
    public String showResult (){
        return "calculator/save";
    }

    @PostMapping ("/save")
    public String calculate (Model model,
                             @RequestParam ("firstOperand") float firstOperand,
                             @RequestParam ("secondOperand") float secondOperand,
                             @RequestParam ("operator") String operator){
        model.addAttribute("result",calculaterService.calculate(firstOperand,secondOperand,operator));
        model.addAttribute("firstOperand",firstOperand);
        model.addAttribute("secondOperand",secondOperand);
        model.addAttribute("operator",operator);
        return "calculator/save";
    }
}
