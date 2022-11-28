package codegym.controller;

import codegym.bean.Mail;
import codegym.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MailController {
@Autowired
    MailServiceImpl mailService;

    @GetMapping("/list")
    public String getListStudent(Model model) {
        List<Mail> mailList = mailService.findAll();
        model.addAttribute("mailList", mailList);
        return "list";
    }

    @GetMapping ("/create")
    public String showForm (Model model){
        model.addAttribute("mail", new Mail());

        String[] languagesList = {"Vietnam", "English", "France"};
        model.addAttribute("languagesList", languagesList);

        int [] sizeList = {5,10,15,20,25};
        model.addAttribute("sizeList", sizeList);
        return ("create");
    }

    @PostMapping("/create")
    public String doSetting(@ModelAttribute ("mail") Mail mail, RedirectAttributes redirectAttributes){
        mailService.save(mail);
        redirectAttributes.addFlashAttribute("msg"," Thêm mới thành công");
        return "redirect:/list";
    }
}
