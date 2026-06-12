package com.example.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String adminIndex(Model model) {
        model.addAttribute("pageTitle", "Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать в Help Desk");
        model.addAttribute("features", List.of(
                "Регистрация обращений",
                "Приоритизация задач",
                "Контакты поддержки"
        ));
        model.addAttribute("thebestyoutubers", "База лучших ютуберов и данных");
        model.addAttribute("applications", "Заявки");
        model.addAttribute("create_applications", "Создание заявки");
        return "admin/admin-index";
    }
}