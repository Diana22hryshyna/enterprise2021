package pl.hryshyna.shop.service;

import pl.hryshyna.shop.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
}
