package com.zeroToHero.controller;

import com.zeroToHero.model.RumisHouse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomePageController {

    @RequestMapping("/basic")
    public String homePagelanding(Model model){

        model.addAttribute("name", "Rumi");
        return "/homepage.html";
    }

    @RequestMapping("/homeitems")
    public String rumisHomeLanding(Model model){

        RumisHouse rumi = RumisHouse.builder().aptNumber(10).table("blue").build();

        model.addAttribute("name", rumi);
        return "/rumishome.html";
    }
    @RequestMapping("/homeparams")
    public String homeParams(@RequestParam String newHome, Model model){

        RumisHouse rumi = RumisHouse.builder().aptNumber(10000).table("bea" + newHome).build();
       model.addAttribute("name", rumi);
        return "/rumishome.html";
    }

    @RequestMapping("/homeparamsdefault")
    public String homeParamsDefault(@RequestParam (required = true) String newHome,
                                    Model model){

        RumisHouse rumi = RumisHouse.builder().aptNumber(10000).table("bea" + newHome).build();
        model.addAttribute("name", rumi);
        return "/rumishome.html";
    }

    @RequestMapping("/homepathvar/{newHome}")
    public String homePathVar(@PathVariable String newHome, Model model){

        RumisHouse rumi = RumisHouse.builder().aptNumber(10000).table("bea" + newHome).build();
        model.addAttribute("name", rumi);
        return "/rumishome.html";
    }
}
