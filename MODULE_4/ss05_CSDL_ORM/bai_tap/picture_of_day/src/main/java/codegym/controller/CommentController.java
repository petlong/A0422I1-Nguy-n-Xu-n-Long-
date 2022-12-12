package codegym.controller;

import codegym.bean.Comment;
import codegym.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class CommentController {
    @Autowired
    private ICommentService iCommentService;

    @GetMapping({"list", ""})
    public String displayList(Model model) {
        model.addAttribute("newComment", new Comment());
        model.addAttribute("list", iCommentService.findAll());
        return "list";
    }

    @PostMapping("comment")
    public String comment(Model model, @ModelAttribute("newComment") Comment comment) {
        iCommentService.comment(comment);
        model.addAttribute("newComment", new Comment());
        model.addAttribute("list", iCommentService.findAll());
        return "list";
    }

    @GetMapping("like")
    public String like(Model model, @RequestParam("id") int id) {
        iCommentService.like(id);
        model.addAttribute("newComment", new Comment());
        model.addAttribute("list", iCommentService.findAll());
        return "list";
    }
}
