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
import ru.kpfu.itis.springControllers.model.User;
import ru.kpfu.itis.springControllers.services.EmailExistsException;
import ru.kpfu.itis.springControllers.services.UserService;
//import ru.kpfu.itis.springControllers.services.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@ComponentScan("ru.kpfu.itis.springControllers.services")
@RequestMapping("/scitopus")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/main",  method = RequestMethod.GET)
    public String main(ModelMap map) {
        //map.put("viewVariable", "Just simple action");
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("gyhjkl", "yghjknm", "rdtfyghuj"));
        articles.add(new Article("1", "yghjknm", "rdtfyghuj"));
        articles.add(new Article("2", "yghjknm", "rdtfyghuj"));
        map.put("articles", articles);
        return "main_page_temp";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistration(ModelMap map) {
        map.put("user", new User());
        return "registration";
    }

//    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
//    public String getSignUpPage(ModelMap map){
//        map.put("user", new User());
////        map.put("message0", this.msa.getMessage("controller.message"));
////        map.put("message1", this.msa.getMessage("controller.param.message", new Double[]{9.78}));
//        return "signUp_form";
//    }

   // @RequestMapping(value = "/new_user", method = RequestMethod.POST)
//    public String postSignUpPage(
//            RedirectAttributes redirectAttributes,
//            @Valid @ModelAttribute("user") User user,
//            BindingResult result,
//            ModelMap map){
//
//        if (result.hasErrors()) {
//            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
//            return "signUp_form";
//        }
//        else {
//                userRepo.createUser(user);
//                redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium; color: #bd2130\">Пользователь \""
//                        + user.getEmail()
//                        + "\" успешно добавлен</span>");
//                return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getSignUpPage").build();
//            }
//        }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String postRegistration(
            RedirectAttributes redirectAttributes,
            @Valid @ModelAttribute("user") User user,
            BindingResult result,
            ModelMap map) throws EmailExistsException {

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "registration";
        }
        else {
            if(user == null){
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                userService.save(user);
                System.out.println("********************");
            }
            redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium;" +
                    " color: #bd2130\">Пользователь \""+
                    "\" успешно добавлен</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#main").build();
        }
    }


    @RequestMapping("/videos")
    public String videos(ModelMap map) {
        return "main_page";
    }

    @RequestMapping("/profile")
    public String profile(ModelMap map) {
        return "personal_area";
    }

    @RequestMapping("/thanks")
    public String thanks(ModelMap map) {
        return "thanks";
    }

    @RequestMapping(value = "/create",  method = RequestMethod.GET)
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
        }
        else {
            if(article == null){
                System.out.println("NULLLLLLLLLLLLL");
            } else {
                //userService.save(article);
                System.out.println("********************");
            }
            redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium;" +
                    " color: #bd2130\">Пользователь \""+
                    "\" успешно добавлен</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("MC#create").build();
        }
    }
}
