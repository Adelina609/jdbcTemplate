package ru.kpfu.itis.springControllers.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.springControllers.model.User;


@Repository
public interface UserDao {
  User getUser(String email);
  int createUser(User user);
  int updateUser(User user);
  int deleteUser(User user);
}
