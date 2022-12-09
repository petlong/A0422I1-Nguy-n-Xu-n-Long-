package codegym.controller;

import codegym.bean.Product;
import codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public String displayList(Model model) {
        model.addAttribute("products", iProductService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("product") Product product) {
//        product.setId((int) (Math.random() * 10000));  // tạo id ngẫu nhiên
        iProductService.save(product);
        return "redirect:/product/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") String id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "detail";
    }

    @GetMapping("/update")
    public String showUpdate(Model model, @RequestParam("id") String id) {
        model.addAttribute("product", iProductService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        iProductService.update(product.getId(), product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id, RedirectAttributes redirect) {
        iProductService.remove(id);
        redirect.addFlashAttribute("msgDelete", "Removed product successfully!");
        return "redirect:/product/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        model.addAttribute("products",iProductService.findByName(search));
        return "list";
    }
}