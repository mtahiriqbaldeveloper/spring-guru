package org.tech.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.tech.webapp.repo.AuthorRepository;

/**
 * @author tiqbal
 */
@Controller
public class AuthorController {

    private final AuthorRepository authorRepo;

    public AuthorController(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/getAuthor")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepo.findAll());
        return "author";
    }
}
