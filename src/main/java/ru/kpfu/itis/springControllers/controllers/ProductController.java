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
import ru.kpfu.itis.springControllers.dao.UserRepo;
import ru.kpfu.itis.springControllers.model.Product;
import ru.kpfu.itis.springControllers.services.Service;
import javax.validation.Valid;
import java.util.Arrays;


@Controller
@RequestMapping("/product")
@ComponentScan("model")
@ComponentScan("services")
public class ProductController {

    @Autowired
    private UserRepo userRepo;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(ModelMap map) {
        map.put("product", new Product());
        map.put("types", Service.getTypes());
        //map.put("name", "Electronic");
        return "product";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String mainPost(
            RedirectAttributes redirectAttributes,
            @Valid @ModelAttribute("product") Product product,
            BindingResult result,
            ModelMap map){

        if (result.hasErrors()) {
            System.out.println(Arrays.toString(result.getAllErrors().toArray()));
            return "product";
        }
        else {
            //userRepo.save(product);
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("PC#main").build();
        }
    }

}
