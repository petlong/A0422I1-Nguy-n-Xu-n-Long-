package codegym.controller;

import codegym.service.IDictionatyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    IDictionatyService dictionatyService;

    @GetMapping ("/search")
    public String showResult (){
        return "dictionary/search";
    }

    @PostMapping ("/search")
    public String search (Model model, @RequestParam ("inputWord") String inputWord){
        model.addAttribute("inputWord", inputWord);
        model.addAttribute("result", dictionatyService.translate(inputWord));
        return "dictionary/search";
    }
}
