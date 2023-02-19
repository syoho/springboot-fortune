package com.example.fortuneapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FortuneController {

    @Autowired
    private FortuneService fortuneService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("fortune", fortuneService.getFortune());
        return "fortune";
    }

//    @GetMapping("/")
//    public String getFortune(Model model) {
//        // add fortune variable to model
//        model.addAttribute("fortune", "Your fortune goes here.");
//        return "fortune";
//    }

}
