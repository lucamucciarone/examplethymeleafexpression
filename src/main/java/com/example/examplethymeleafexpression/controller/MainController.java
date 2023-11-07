package com.example.examplethymeleafexpression.controller;

import com.example.examplethymeleafexpression.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("testexpression")
    public String test(Model model){
        Book book = new Book();
        book.setId(1);
        book.setTitle("Test");
        book.setIsbn("ISBN Test");
        model.addAttribute("book",book);
        return "testpage";
    }
}
