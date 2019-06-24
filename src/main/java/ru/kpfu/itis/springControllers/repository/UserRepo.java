package ru.kpfu.itis.springControllers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.User;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findByEmail(String email);

    List<User> findAll();

    User findByEmailAndPassword(String email, String password);

    //getAll() //все вопросы
    //putOne post запрос
    //
}
