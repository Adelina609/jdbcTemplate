package ru.kpfu.itis.springControllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.springControllers.dao.UserRepo;
import ru.kpfu.itis.springControllers.model.User;

@ComponentScan("ru.kpfu.itis.springControllers.dao")
@ComponentScan("ru.kpfu.itis.springControllers.model")
@Service
public class UserService {

    @Autowired
    private  UserRepo userRepoo;

    public  void save(User user) throws EmailExistsException {

        if (isEmailExists(user.getEmail())) {
            throw new EmailExistsException(
                    "There is an account with that email adress: "
                            +  user.getEmail());
        } else {
            userRepoo.save(user);
        }
    }

    public  User get(String email){
        return userRepoo.findByEmail(email);
    }

    public  void delete(User user){
        userRepoo.delete(user);
    }

    private boolean isEmailExists(String email) {
        User user = userRepoo.findByEmail(email);
        return user != null;
    }
}
