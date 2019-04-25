package ru.kpfu.itis.springControllers.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.User;

import java.util.Optional;

@Repository
@ComponentScan("ru.kpfu.itis.SpringControllers.model")
public interface UserRepo extends CrudRepository<User, Long> {

    public User findByEmail(String email);

    public Optional<User> findById(Long id);

}
