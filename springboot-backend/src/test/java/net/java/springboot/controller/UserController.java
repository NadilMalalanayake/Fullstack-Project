package net.java.springboot.controller;


import net.java.springboot.model.User;
import net.java.springboot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private userRepository userRepo;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepo.findAll();
    }
}
