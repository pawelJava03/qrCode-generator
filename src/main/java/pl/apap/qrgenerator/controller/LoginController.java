package pl.apap.qrgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Upewnij się, że istnieje widok 'login.html' w odpowiednim katalogu
    }
}