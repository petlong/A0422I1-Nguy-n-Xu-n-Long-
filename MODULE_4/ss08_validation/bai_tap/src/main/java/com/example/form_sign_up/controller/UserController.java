package com.example.form_sign_up.controller;

import com.example.form_sign_up.model.User;
import com.example.form_sign_up.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("create")
    public String create(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "create";
    }

    @PostMapping("create")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
//        blog.setId((int) (Math.random() * 10000));  // tạo id ngẫu nhiên
        if (bindingResult.hasErrors()) {
            return "create";
        }
            else{
                iUserService.create(user);
                redirectAttributes.addFlashAttribute("msg", "Create User successfully!");
                return "result";
            }
        }
}
