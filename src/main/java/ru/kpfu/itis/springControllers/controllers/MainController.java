package ru.kpfu.itis.springControllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scitopus")
public class MainController {

    @RequestMapping("/main")
    public String main(ModelMap map) {
//        map.put("viewVariable", "Just simple action");
        return "main_page";
    }

    @RequestMapping("/videos")
    public String videos(ModelMap map) {
        return "main_page";
    }

    @RequestMapping("/profile")
    public String profile(ModelMap map) {
        return "personal_area";
    }

    @RequestMapping("/sources")
    public String sources(ModelMap map) {
        return "sources";
    }

    @RequestMapping("/registration")
    public String registration(ModelMap map) {
        return "registration";
    }

    @RequestMapping("/thanks")
    public String thanks(ModelMap map) {
        return "thanks";
    }

    @RequestMapping("/create")
    public String create(ModelMap map) {
        return "create_own_post";
    }


}

