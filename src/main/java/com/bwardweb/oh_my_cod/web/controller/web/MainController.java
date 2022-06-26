package com.bwardweb.oh_my_cod.web.controller.web;

import com.bwardweb.oh_my_cod.model.Fish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class MainController {
    @GetMapping("/fish")
    public String getFish(Model model){
        Fish fish = new Fish(1l, "Cod");
        model.addAttribute("fish", fish);
        return "home";
    }
}
