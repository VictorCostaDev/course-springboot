package com.educandoweb.course.services;

import com.educandoweb.course.entities.Usuario;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
       Optional<Usuario> optional = repository.findById(id);
       return optional.get();
    }
}
