package ru.kpfu.itis.springControllers.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.Person;
import ru.kpfu.itis.springControllers.model.User;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findByEmail(String email);

    User findByEmailAndPassword(String email, String password);
}
