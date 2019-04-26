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
import ru.kpfu.itis.springControllers.model.Article;
import ru.kpfu.itis.springControllers.model.Login;
import ru.kpfu.itis.springControllers.services.UserService;

import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.model")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap map) {
        map.put("login", new Login());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(RedirectAttributes redirectAttributes,
                            @Valid
        @ModelAttribute("article")
        Login login, BindingResult result, ModelMap map) {

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "login";
        } else {
            if(!userService.findByEmailAndPassw(login.getEmail(), login.getPassword())){
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                return "main";
            }
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#thanks").build();
        }
    }
}
