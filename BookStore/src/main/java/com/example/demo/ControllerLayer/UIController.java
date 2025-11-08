package com.example.demo.ControllerLayer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @GetMapping("/books")
    public String booksPage() {
        return "books";
    }

    @GetMapping("/add-book")
    public String addBookPage() {
        return "add-book";
    }
}
