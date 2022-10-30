package ru.amaeretran.pp.service;

import ru.amaeretran.pp.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    void save(User user);
    void delete(int id);
    void update(User user);
    User getUserById(int id);
}
