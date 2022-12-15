package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogServiceImpl;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        return "blog/list";
    }

    @GetMapping("/create")
    public String create (Model model){
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "/blog/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("blog") Blog blog) {
//        blog.setId((int) (Math.random() * 10000));  // tạo id ngẫu nhiên
        iBlogService.create(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/detail/{blog_id}")
    public String edit(@PathVariable("blog_id") String id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/detail";
    }

        @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") String id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/blog/update";
    }

//    @PostMapping("/update")
//    public String doUpdate(@ModelAttribute("blog") Blog blog) {
//        iBlogService.update(blog);
//        return "redirect:/blog/list";
//    }

        @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog) {
        iBlogService.update(blog.getId(), blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id, RedirectAttributes redirect) {
        iBlogService.delete(id);
        redirect.addFlashAttribute("msgDelete", "Removed product successfully!");
        return "redirect:/blog/list";
    }

//    @GetMapping("/search")
//    public String search(@RequestParam("search") String search, Model model) {
//        model.addAttribute("products",iBlogService.f(search));
//        return "list";
//    }
}
