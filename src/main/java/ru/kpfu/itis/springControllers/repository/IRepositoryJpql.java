package ru.kpfu.itis.springControllers.repository;

import ru.kpfu.itis.springControllers.model.User;

public interface IRepositoryJpql {
    void save(User user);
    void deleteUser(String email);
    User getUser(String email);
    void updateUserName(String username);
}
