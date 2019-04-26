package ru.kpfu.itis.springControllers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.springControllers.repository.ApiService;
import java.io.IOException;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.services")
public class MainController {

    @Autowired
    private ApiService apiService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(ModelMap map) throws IOException {
        map.put("episodes", apiService.getEpisodes());
        return "main_page";
    }

    @RequestMapping("/thanks")
    public String thanks(ModelMap map) {
        return "thanks";
    }
}




