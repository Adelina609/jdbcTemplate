package ru.kpfu.itis.springControllers.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import ru.kpfu.itis.springControllers.model.Episode;
import ru.kpfu.itis.springControllers.model.Person;
import ru.kpfu.itis.springControllers.model.StringToEntityConverter;

import java.util.Locale;

@Configuration
@ComponentScan("ru.kpfu.itis.springControllers.controllers")
@ComponentScan("ru.kpfu.itis.springControllers.dao")
@ComponentScan("ru.kpfu.itis.springControllers.model")
@EnableJpaRepositories(basePackages = {"ru.kpfu.itis.springControllers.dao"})
@EnableWebMvc
public class Config implements WebMvcConfigurer {

    @Autowired
    public StringToEntityConverter stringToEntityConverter;

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        resolver.setRedirectContextRelative(false);
        return resolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToEntityConverter);
    }

    @Bean
    public StringToEntityConverter stringToEntityConverter(){
        return new StringToEntityConverter(Person.class);
    }

    @Bean
    public StringToEntityConverter stringToEntityConverter2(){
        return new StringToEntityConverter(Episode.class);
    }
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
        res.setBasenames("classpath:i18n/messages", "classpath:i18n/validation");
        res.setCacheSeconds(0);
        res.setDefaultEncoding("UTF-8");
        res.setUseCodeAsDefaultMessage(false);
        return res;
    }

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setCookieName("lang");
        localeResolver.setDefaultLocale(new Locale("ru", "RU"));
        return localeResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/vendor/**").addResourceLocations("/vendor/");
    }
}
