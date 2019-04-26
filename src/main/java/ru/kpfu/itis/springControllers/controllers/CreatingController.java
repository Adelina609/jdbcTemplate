package ru.kpfu.itis.springControllers.controllers;

import com.sun.media.jfxmedia.logging.Logger;
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
import ru.kpfu.itis.springControllers.repository.ArticleRepo;
import ru.kpfu.itis.springControllers.model.Article;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.logging.Level;

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

        if (result.hasErrors() || article==null) {
            //Logger.logMsg(Level.INFO.intValue(),Arrays.toString(result.getAllErrors().toArray()));
            return "create";
        } else {
            articleRepo.save(article);
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#thanks").build();
        }
    }
}
