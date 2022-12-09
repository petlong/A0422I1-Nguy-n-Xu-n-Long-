package codegym.controller;

import codegym.bean.Mail;
import codegym.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MailController {
@Autowired
    private MailServiceImpl mailService;

//    @GetMapping("/list")
//    public String getListStudent(Model model) {
//        List<Mail> mailList = mailService.findAll();
//        model.addAttribute("mailList", mailList);
//        return "list";
//    }

    @GetMapping ("/showForm")
    public String showForm (Model model){
        model.addAttribute("mail", new Mail());

        String[] languagesList = {"Vietnam", "English", "France"};
        model.addAttribute("languagesList", languagesList);

        int [] sizeList = {5,10,15,20,25};
        model.addAttribute("sizeList", sizeList);
        return ("create");
    }

    @PostMapping("/create")
    public String doSetting(@ModelAttribute ("mail") Mail mail, Model model){
       model.addAttribute("languages",mail.getLanguages());
       model.addAttribute("pageSize",mail.getPageSize());
       model.addAttribute("spamsFilter",mail.isSpamsFilter());
       model.addAttribute("signature",mail.getSignature());
        return "list";
    }

//    @PostMapping("/edit")
//    public String doEdit(@ModelAttribute ("mail") Mail mail, ModelMap model){
//        model.addAttribute("languages",mail.setLanguages(););
//        model.addAttribute("pageSize",mail.setPageSize(););
//        model.addAttribute("spamsFilter",mail.setSpamsFilter(););
//        model.addAttribute("signature",mail.s());
//        return "list";
//    }
}
