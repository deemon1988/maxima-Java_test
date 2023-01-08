package org.example.repository;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SimpleUserRepository implements DaoRepository {
    private List<User> users = new ArrayList<>();

    public SimpleUserRepository() {

        users.add(new User("John", "john@domain.com"));
        users.add(new User("Susan", "susan@domain.com"));
    }
    @Override
    public boolean save(User element) {return users.add(element);}    // create

    @Override
    public User get(int id) {                          //read
        return users.get( id);
    }
    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(User user) {
users.remove(user);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

}
