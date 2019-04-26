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
import ru.kpfu.itis.springControllers.model.User;
import ru.kpfu.itis.springControllers.services.UserService;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.services")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistration(ModelMap map) {
        map.put("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String postRegistration(
            RedirectAttributes redirectAttributes,
            @Valid @ModelAttribute("user") User user,
            BindingResult result,
            ModelMap map) {

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "registration";
        } else {
            if (user == null) {
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                userService.save(user);
                System.out.println("********************");
            }
            redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium;" +
                    " color: #bd2130\">Пользователь \"" +
                    "\" успешно добавлен</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#main").build();
        }
    }
}
