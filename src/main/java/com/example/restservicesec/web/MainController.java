package com.example.restservicesec.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Cheranev N.
 * created on 04.07.2020.
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String getMainPage() {
        return "index";
    }
}
