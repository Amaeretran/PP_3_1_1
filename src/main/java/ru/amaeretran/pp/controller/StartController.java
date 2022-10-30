package ru.amaeretran.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.amaeretran.pp.service.StartService;

@Controller
public class StartController {
    private final StartService startService;

    public StartController(StartService startService) {
        this.startService = startService;
    }
    @GetMapping(value = "/")
    public String printWelcome(Model model) {
        model.addAttribute("messages", startService.getMessages());
        return "/start";
    }
}
