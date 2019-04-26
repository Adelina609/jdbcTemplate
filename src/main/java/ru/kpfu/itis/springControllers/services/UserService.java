package ru.kpfu.itis.springControllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.springControllers.dao.UserRepo;
import ru.kpfu.itis.springControllers.model.User;

@ComponentScan("ru.kpfu.itis.springControllers.dao")
@ComponentScan("ru.kpfu.itis.springControllers.model")
@Service
public class UserService {

    @Autowired
    private  UserRepo userRepoo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public  void save(User user)  {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepoo.save(user);
    }

    public  User get(String email){
        return userRepoo.findByEmail(email).get(0);
    }

    public  void delete(User user){
        if(!isEmailExists(user.getEmail())){
            //
        } else {
            userRepoo.delete(user);
        }
    }

    private boolean isEmailExists(String email) {
        User user = userRepoo.findByEmail(email).get(0);
        return user != null;
    }
}