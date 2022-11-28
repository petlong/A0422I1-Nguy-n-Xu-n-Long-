package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/condiment")
public class CondimentController {

    @GetMapping ("/save")
    public String condiment (){
        return "condiment/save";
    }

    @PostMapping ("/save")
    public String save (Model model, @RequestParam ("condiment") String []condiment){
        List<String> listCondiment = new ArrayList<>();
        for (String rs: condiment ) {
            listCondiment.add(rs);
        }
        model.addAttribute("listCondiment",listCondiment);
        return "condiment/save";
    }
}
