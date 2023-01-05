package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.BlogServiceImpl;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("blogList", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String create (Model model){
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("blog") Blog blog, RedirectAttributes redirect) {
//        blog.setId((int) (Math.random() * 10000));  // tạo id ngẫu nhiên
        iBlogService.create(blog);
        redirect.addFlashAttribute("msgNew", "Add new blog successfully!");
        return "redirect:/blog/list";
    }


    @GetMapping("/detail/{blog_id}")
    public String edit(@PathVariable("blog_id") String id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/detail";
    }

        @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") String id) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "blog/update";
    }

        @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blog/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id, RedirectAttributes redirect) {
        iBlogService.delete(id);
        redirect.addFlashAttribute("msgDelete", "Removed blog successfully!");
        return "redirect:/blog/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        model.addAttribute("blogList",iBlogService.findAllByNameContaining(search));
        return "blog/list";
    }

    @GetMapping("/listCategory")
    public String listCategory(Model model) {
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "blog/listCategory";
    }

    @GetMapping("/createCategory")
    public String createCategory (Model model){
        model.addAttribute("category", new Category());
        return "blog/createCategory";
    }

    @PostMapping("/createCategory")
    public String saveCategory(@ModelAttribute("category") Category category) {
//        blog.setId((int) (Math.random() * 10000));  // tạo id ngẫu nhiên
        iCategoryService.create(category);
        return "redirect:/blog/listCategory";
    }

    @GetMapping("/updateCategory")
    public String showUpdateCategory(Model model, @RequestParam("id") Integer id) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "blog/updateCategory";
    }

    @PostMapping("/updateCategory")
    public String doUpdateCategory(@ModelAttribute("category") Category category) {
        iCategoryService.update(category);
        return "redirect:/blog/listCategory";
    }

    @GetMapping("/deleteCategory")
    public String deleteCategory(@RequestParam("id") Integer id) {
        iCategoryService.delete(id);
        return "redirect:/blog/listCategory";
    }

    @GetMapping("/searchCategory/{categoryName}")
    public String searchCategory(@PathVariable("categoryName") String categoryName, Model model) {
        model.addAttribute("blogList",iBlogService.findByCategoryName(categoryName));
//        model.addAttribute("categories", iCategoryService.findAll());
//        model.addAttribute(("categoryName"), categoryName);
        return "blog/list";
    }

    @GetMapping(value = "/listpaging")
    public String listpaging(Model model, @RequestParam("page") Optional<Integer> page,
                             @RequestParam("size") Optional<Integer> size,
                             @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("datePublish");
        Page<Blog> blogs = iBlogService.findAllWithPagingAndSort(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending()));
        model.addAttribute("blogs", blogs);
        int totalPages = blogs.getTotalPages();
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "blog/listPaging";
    }
}
