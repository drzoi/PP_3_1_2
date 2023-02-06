package ru.drzoi.PP_3_1_2.service;



import ru.drzoi.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);
    void updateUser(User user);
    List<User> getAllUsers();

}
