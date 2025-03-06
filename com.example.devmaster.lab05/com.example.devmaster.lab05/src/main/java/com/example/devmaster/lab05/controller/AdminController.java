package com.example.devmaster.lab05.controller;



import com.example.devmaster.lab05.models.Content;
import com.example.devmaster.lab05.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ContentService contentService;

    public AdminController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/list")
    public String listContents(Model model) {
        model.addAttribute("contents", contentService.getAll());
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String deleteContent(@PathVariable int id) {
        contentService.deleteContent(id);
        return "redirect:/admin/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("content", new Content());
        return "add";
    }

    @PostMapping("/add")
    public String addContent(@ModelAttribute Content content) {
        contentService.addContent(content);
        return "redirect:/admin/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Content content = contentService.getById(id);
        if (content == null) {
            return "redirect:/admin/list";
        }
        model.addAttribute("content", content);
        return "edit";
    }

    @PostMapping("/edit")
    public String editContent(@ModelAttribute Content content) {
        contentService.updateContent(content);
        return "redirect:/admin/list";
    }

}
