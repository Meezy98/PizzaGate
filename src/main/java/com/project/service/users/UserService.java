package com.project.service.users;

import com.project.models.dto.UserCredsDTO;
import com.project.models.unique.UserCreds;
import com.project.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    UserCredsDTO credsDTO;

    @Autowired
    UserCreds userCreds;

    public Optional<UserCreds>validateUser(String username, String password){

        userCreds.setUserName(username);
        userCreds.setPassword(password);
        return userDAO.validateUser(credsDTO.getUsername(), credsDTO.getPassword());

    }
    public List<UserCreds> showUsers(){
    return userDAO.findAll();

    }
public void createUser(String username, String password){
        userCreds.setUserName(username);
        userCreds.setPassword(password);
        if (userCreds.getPassword()== null || userCreds.getUserName() == null)
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,"One or more fields is missing data");
            else userDAO.save(userCreds);

}
}
