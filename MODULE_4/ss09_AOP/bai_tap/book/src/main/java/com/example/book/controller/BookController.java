package com.example.book.controller;

import com.example.book.handler.BookException;
import com.example.book.model.Book;
import com.example.book.model.Card;
import com.example.book.service.IBookService;
import com.example.book.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @Autowired
    private ICardService iCardService;

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("books", iBookService.findAll());
        return "book/list";
    }

    @GetMapping("/create")
    public String create (Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "book/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("book") Book book, RedirectAttributes redirect) {
        iBookService.save(book);
        redirect.addFlashAttribute("msgNew", "Add new book successfully!");
        return "redirect:/book/list";
    }

    @GetMapping("borrow/{book_id}")
    public String showBorrow(@PathVariable("book_id") String id, Model model) {
        model.addAttribute("book", iBookService.findById(id));
        model.addAttribute("card", new Card());
        return "book/borrow";
    }

    @PostMapping("borrow")
    public String doBorrow(@ModelAttribute("book") Book book, @ModelAttribute ("card") Card card, Model model) throws Exception{
        if (book.getAmount() == 0) {
            throw new BookException("No more book");
        }
        int code = (int) Math.floor(((Math.random() * 899999) + 100000));
        card.setId(code);
        iCardService.save(card);
        model.addAttribute("book", book);
        model.addAttribute("message", "You have successfully borrowed the book, your code is " +
                code);
        return "book/borrow";
    }

     @GetMapping("listCard")
    public String listCard(Model model) {
        model.addAttribute("cards", iCardService.findAll());
        return "book/listCard";
    }

    @GetMapping("/searchCard")
    public String search(@RequestParam("searchCard") Integer searchCard, Model model) {
        model.addAttribute("cards",iCardService.findById(searchCard));
        return "book/listCard";
    }

    @GetMapping("/deleteCard")
    public String deleteCategory(@RequestParam("id") Integer id, @ModelAttribute ("card") Card card, RedirectAttributes redirect ) {
        iCardService.deleteById(id);
        redirect.addFlashAttribute("msgDelete", "Give-back book successfully!");
        return "redirect:/book/list";
    }
}
