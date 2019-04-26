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
import ru.kpfu.itis.springControllers.model.Login;
import ru.kpfu.itis.springControllers.model.User;
import ru.kpfu.itis.springControllers.services.UserService;
import ru.kpfu.itis.springControllers.utils.SourcesAdd;
import ru.kpfu.itis.springControllers.utils.UserNotFoundException;

import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.model")
public class ProfileController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(ModelMap map) {
        map.put("user", new User());
        SourcesAdd utils = new SourcesAdd();
        map.put("articles", utils.pullArticles());
        return "personal_area";
    }


    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String profilePost(RedirectAttributes redirectAttributes,
                            @Valid
                            @ModelAttribute("user")
                                    User user, BindingResult result, ModelMap map) {

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "user";
        } else {
            if(!userService.findByEmailAndPassw(user.getEmail(), user.getPassword())){
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                userService.save(user);
                return "personal_area";
            }
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#profile").build();
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(ModelMap map) throws UserNotFoundException {
        userService.delete(new User());
        return "personal_area";
    }
}
