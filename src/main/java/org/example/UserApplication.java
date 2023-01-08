package org.example;

import org.example.model.User;
import org.example.repository.BaseDaoRepository;
import org.example.repository.SimpleUserRepository;

import java.util.Optional;

public class UserApplication {
    private static BaseDaoRepository<User> baseDaoRepository;

    public static void main(String[] args) {
        baseDaoRepository = new SimpleUserRepository();
        baseDaoRepository.save(new User("Julie", "[email protected]"));  //create
        System.out.println(baseDaoRepository.getAll());

        User user1 = baseDaoRepository.get(1);                      //read
        System.out.println(user1);

        baseDaoRepository.update(user1, new String[]{"Jake", "[email protected]"});  //update
        System.out.println(baseDaoRepository.get(0));


       User user2 = baseDaoRepository.get(1);
        baseDaoRepository.delete(user2);
        baseDaoRepository.save(new User("Julie", "[email protected]"));
        System.out.println(baseDaoRepository.getAll());
        baseDaoRepository.getAll().forEach(user -> System.out.println(user.toString()));
    }


    }

