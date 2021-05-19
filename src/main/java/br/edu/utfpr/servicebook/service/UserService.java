package br.edu.utfpr.servicebook.service;

import br.edu.utfpr.servicebook.model.entity.User;
import br.edu.utfpr.servicebook.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User entity){

        return userRepository.save(entity);
    }

    public void delete(Long id){

        userRepository.deleteById(id);
    }

    public List<User> findAll(){

        return this.userRepository.findAll();
    }

    public Optional<User> findById(Long id){

        return this.userRepository.findById(id);
    }

    public Optional<User> findByName(String name){

        return this.userRepository.findByName(name);
    }
}