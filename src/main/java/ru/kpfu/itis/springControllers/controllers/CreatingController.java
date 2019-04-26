package ru.kpfu.itis.springControllers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.kpfu.itis.springControllers.dao.ArticleRepo;
import ru.kpfu.itis.springControllers.model.Article;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.services")
public class CreatingController {

    @Autowired
    private ArticleRepo articleRepo;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(ModelMap map) {
        map.put("article", new Article());
        return "create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postCreate(
            RedirectAttributes redirectAttributes,
            @Valid @ModelAttribute("article") Article article,
            BindingResult result,
            ModelMap map) {

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "create";
        } else {
            if (article == null) {
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                articleRepo.save(article);
                System.out.println("********************");
            }
            redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium;" +
                    " color: #bd2130\">Пользователь \"" +
                    "\" успешно добавлен</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#thanks").build();
        }
    }
}
