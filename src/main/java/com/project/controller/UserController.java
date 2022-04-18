package com.project.controller;

import com.project.models.dto.UserCredsDTO;
import com.project.models.unique.UserCreds;
import com.project.service.users.UserService;
import com.project.util.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {
@Autowired
    UserService userService;

UserCredsDTO userCredsDTO;
@ResponseStatus(value = HttpStatus.OK)
@GetMapping(path = "all")
    public List<UserCreds> findAll(){
    return userService.showUsers();}

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(path = "login")
    public Optional<UserCreds>validateUser(@RequestParam(value = "username") String username,
                                           @RequestParam(value = "pass") String password){
        userCredsDTO.setUsername(username);
        userCredsDTO.setPassword(password);

        if (userService.validateUser(userCredsDTO.getUsername(),userCredsDTO.getPassword()).isPresent())
        return userService.validateUser(userCredsDTO.getUsername(),userCredsDTO.getPassword());
   else throw new UserNotFoundException("User not found");
    }
    @PostMapping(path = "save")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveUser(@RequestBody UserCredsDTO credsDTO){
    this.userCredsDTO = credsDTO;
    userService.createUser(credsDTO.getUsername(),credsDTO.getPassword());
    return "Successfully Created user " + credsDTO.getUsername();
    }
    }

