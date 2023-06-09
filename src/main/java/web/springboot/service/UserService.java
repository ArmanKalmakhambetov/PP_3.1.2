package web.springboot.service;

import web.springboot.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public void deleteUser(Long id);

    public void updateUser(User user);

    public User findById(Long id);

    public List<User> getAllUsers();
}
