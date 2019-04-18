package ru.kpfu.itis.springControllers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import ru.kpfu.itis.springControllers.dao.UserRepo;
import ru.kpfu.itis.springControllers.model.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/user")
@ComponentScan("ru.kpfu.itis.springControllers.model")
public class RegistrationController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private LocaleResolver localeResolver;

    private MessageSourceAccessor msa;

    @Autowired
    private void setMessageSourceAccessor(MessageSource ms){
        this.msa = new MessageSourceAccessor(ms);
    }

    @Autowired
    private UserRepo userRepoo;

    @RequestMapping(value = "/get_user", method = RequestMethod.GET)
    public String index(ModelMap map) {
        userRepoo.save(new User("Name", "katyn.kotova@mail.ru", "passw"));
        userRepoo.save(new User("Neeer", "kook@ki.ru","hiiiii"));
    List<User> users = userRepoo.findByEmail("kook@ki.ru");
    map.put("message", users.get(0));
        return "index";
    }

//    @RequestMapping(value = "/episodes/{id}", method = RequestMethod.GET)
//    public String episodes(Episode episode) {
//        List<Episode> episodes = new ArrayList<>();
//        episodes.add(new Episode("name", "desc"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        episodes.add(new Episode("name2", "desc2"));
//        map.addAttribute("person", new Person());
//        map.put("episodesList", episodes);
//        return "multiple_select_page";
//    }
//
//    @RequestMapping(value = "/episodes", method = RequestMethod.POST)
//    public String postEpisodes(
//            RedirectAttributes redirectAttributes,
//            @Valid @ModelAttribute("person") Person person,
//            BindingResult result,
//            ModelMap map){
//
//        if (result.hasErrors()) {
//            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
//            return "multiple_select_page";
//        }
//        else {
//            //userRepo.createUser(user);
//            redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium;" +
//                    " color: #bd2130\">Пользователь \""+
//                    "\" успешно добавлен</span>");
//            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#episodes").build();
//        }
//    }



//    @RequestMapping(value = "/get_upd_user", method = RequestMethod.GET)
//    public String getUpdatedUser(ModelMap map) {
//        User user = new User("Name", "fgvhb@hjk.ru", "passw");
//        userRepo.updateUser(user);
//        map.put("message", user);
//        return "index";
//    }
//
//    @RequestMapping(value = "/del_user", method = RequestMethod.GET)
//    public String deleteUser(ModelMap map) {
//        User user = new User("Name", "fgvhb@hjk.ru", "passw");
//        userRepo.deleteUser(user);
//        map.put("message", user);
//        return "del_page";
//    }

    @RequestMapping("/change")
    public String change(@RequestParam String locale){
        // Check here for param format
        String[] localeData = locale.split("_");
        localeResolver.setLocale(request, response, new Locale(localeData[0], localeData[1]));
        return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getSignUpPage").build();
    }

    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String getSignUpPage(ModelMap map){
        map.put("user", new User());
//        map.put("message0", this.msa.getMessage("controller.message"));
//        map.put("message1", this.msa.getMessage("controller.param.message", new Double[]{9.78}));
        return "signUp_form";
    }

//    @RequestMapping(value = "/del_user", method = RequestMethod.GET)
//    public String getDelUserPage(ModelMap map){
//        map.put("user", new User());
//        return "index";
//    }



//    @RequestMapping(value = "/del_user", method = RequestMethod.POST)
//    public String postDelUserPage(
//            RedirectAttributes redirectAttributes,
//            @Valid @ModelAttribute("userCrud") UserCrud userCrud,
//            BindingResult result,
//            ModelMap map){
//
//        map.addAttribute("userCrud", userCrud);
//
//        if (result.hasErrors()) {
//            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
//            System.out.println("ERRRRRRRRRRRRR*****************************");
//            return "index";
//        }
//        else {
//            if(userRepo.getUser(userCrud.getEmail()) == null){
//                redirectAttributes.addFlashAttribute("message", "Пользователь не найден");
//                return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getDelUserPage").build();
//            } else {
//                userRepo.deleteUser(userRepo.getUser(userCrud.getEmail()));
//                redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium; color: #bd2130\">Пользователь \""
//                        //достаем из репозитория юзера
//                        + userCrud.getEmail()
//                        + "\" успешно удален</span>");
//                return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getDelUserPage").build();
//            }
//        }
//    }



//    @RequestMapping(value = "/new_user", method = RequestMethod.POST)
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

//    @RequestMapping(value = "/new_user", method = RequestMethod.POST)
//    public String postSignUpPage(
//            RedirectAttributes redirectAttributes,
//            @Valid @ModelAttribute("user") User user,
//            BindingResult result,
//            ModelMap map){
//
//        if (result.hasErrors()) {
//            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
//            System.out.println("ERRRRRRRRRRRRR*****************************");
//            return "signUp_form";
//        }
//        else {
//            if (userRepo.getUser(user.getEmail()) != null) {
//
//                userRepo.updateUser(user);
//                redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium; color: #bd2130\"" +
//                        ">Данные успешно обновлены </span>");
//                return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getSignUpPage").build();
//
//            } else {
//                System.out.println(")))))))))))))))))))))))))))))))))))");
//                //добавляем нового юзера
//                userRepo.save(user);
//                redirectAttributes.addFlashAttribute("message", "<span style=\"font-size: medium; color: #bd2130\">Пользователь \""
//                        //достаем из репозитория юзера
//                        + user.getEmail()
//                        + "\" успешно добавлен</span>");
//                return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#getSignUpPage").build();
//            }
//        }
    }
