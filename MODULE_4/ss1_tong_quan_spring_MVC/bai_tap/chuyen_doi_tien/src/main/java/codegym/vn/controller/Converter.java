package codegym.vn.controller;

import codegym.vn.service.ConverterServiceImp;
import codegym.vn.service.IConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {
    @Autowired
    IConverterService converterService;

    @GetMapping("/convert")
    public String showConvert(){
        return "/convert";
    }
    @PostMapping("/convert")
    public String doConvert(Model model, @RequestParam ("amount") float amount)
    {
        model.addAttribute("amount", amount);
        model.addAttribute("result",converterService.convert(amount));
        return "/convert";

    }
}
