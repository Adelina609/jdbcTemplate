package ru.kpfu.itis.springControllers.controllers;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.kpfu.itis.springControllers.dao.ArticleRepo;
import ru.kpfu.itis.springControllers.model.Article;
import ru.kpfu.itis.springControllers.model.User;
import ru.kpfu.itis.springControllers.services.UserService;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/scitopus")
@ComponentScan("ru.kpfu.itis.springControllers.services")
public class MainController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(ModelMap map) {
        return "main_page";
    }

    @RequestMapping("/thanks")
    public String thanks(ModelMap map) {
        return "thanks";
    }
}




