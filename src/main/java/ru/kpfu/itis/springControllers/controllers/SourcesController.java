package ru.kpfu.itis.springControllers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.itis.springControllers.services.SourcesService;
import ru.kpfu.itis.springControllers.utils.SourcesAdd;

@Controller
@ComponentScan("ru.kpfu.itis.springControllers.services")
@RequestMapping("/scitopus")
public class SourcesController {

    @Autowired
    private SourcesService sourceService;

    @RequestMapping("/sources")
    public String sources(ModelMap map) {
        SourcesAdd utils = new SourcesAdd();
        //sourceService.save(utils.pullSources());
        map.put("sources", utils.pullSources());
        return "sources";
    }


}