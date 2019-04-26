package ru.kpfu.itis.springControllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.springControllers.repository.UserRepo;
import ru.kpfu.itis.springControllers.model.User;
import ru.kpfu.itis.springControllers.utils.UserNotFoundException;

@ComponentScan("ru.kpfu.itis.springControllers.repository")
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

    public boolean findByEmailAndPassw(String email, String password){
        return passwordEncoder.matches(password,
                userRepoo.findByEmailAndPassword(email, password).getPassword());
    }

    public  User get(String email){
        if(isEmailExists(email)) {
            return userRepoo.findByEmail(email).get(0);
        } else {
            return null;
        }
    }

    private boolean isEmailExists(String email) {
        User user = userRepoo.findByEmail(email).get(0);
        return user != null;
    }

    public  void delete(User user) throws UserNotFoundException {
        if(!isEmailExists(user.getEmail())){
            throw new UserNotFoundException("User not found");
        } else {
            userRepoo.delete(user);
        }
    }
}