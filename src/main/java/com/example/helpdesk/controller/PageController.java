package com.example.helpdesk.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать в Help Desk");
        model.addAttribute("features", List.of(
                "Регистрация обращений",
                "Приоритизация задач",
                "Контакты поддержки"
        ));
        model.addAttribute("thebestyoutubers", "База лучших ютуберов и данных");
        model.addAttribute("applications", "Заявки");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "О нас");
        model.addAttribute("teamName", "Учебная команда Help Desk");
        model.addAttribute("description", "Мы создаём учебную систему для обработки обращений пользователей.");
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("pageTitle", "Контакты поддержки");
        model.addAttribute("supportEmail", "support@helpdesk.local");
        model.addAttribute("workTime", "Пн-Пт, 09:00-18:00");
        model.addAttribute("phone", "+7 (000) 000-00-00");
        model.addAttribute("miniTitle1", "Что указать в обращении");
        model.addAttribute("miniTitle2", "Список каналов поддержки");
        model.addAttribute("helpchannels", List.of(
                "Дополнительный телефон горячей линии: +7 (228) 133-71-33",
                "Вторая почта поддержки: krytoipacan2009@mail.ru",
                "Помощник во ВКонтакте: (ссылка на ВКонтакте)",
                "Помощник в Max: (ссылка на Max)"
        ));
        return "contacts";
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        model.addAttribute("pageTitle", "Список лучших ютуберов");
        model.addAttribute("miniTitle", "Часто задаваемые вопросы");
        model.addAttribute("theoftenQuestions", List.of(
                "Первый вопрос: Как дела?",
                "Второй вопрос: Что делаешь?",
                "Третий вопрос: Скинь домашку Ваня пж",
                "Четвертый вопрос: Это кто-то читает(?"
        ));
        return "faq";
    }
}
