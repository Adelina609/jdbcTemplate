package ru.kpfu.itis.springControllers.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    /**
     * This Validator validates *just* Person instances
     */
    public boolean supports(Class user) {
        return User.class.equals(user);
    }

    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
        User user = (User) obj;
        if (user.getName().length() < 3) {
            e.rejectValue("name", "name.empty");
        } else if (!(user.getEmail().contains(".")
                && user.getEmail().contains("@"))) {
            e.rejectValue("email", "email.empty");
        }
    }
}
