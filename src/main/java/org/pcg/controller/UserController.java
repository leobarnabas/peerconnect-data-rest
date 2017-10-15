package org.pcg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.pcg.model.User;
import org.pcg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Leo on 10/1/2017.
 */
@RestController
@RequestMapping(value = "/users")
@Api(value = "Users", description = "User information")
public class UserController {
    @Autowired
    UserRepository userRepository;

    /*private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();*/


    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get all users", notes = "Returns all the users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Insert user", notes = "Returns inserted user")
    User saveUser(@RequestBody @Valid User user) {
        /*user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));*/
        return userRepository.insert(user);
    }

    @RequestMapping(value = "/{lastName}", method = RequestMethod.GET)
    @ApiOperation(value = "Get user by last name", notes = "Returns all the users with matching last name")
    List<User> findByLastName(@RequestParam String lastName) {
        return userRepository.findByLastName(lastName);
    }

    @RequestMapping(value = "/findByAreaInAndUserType", method = RequestMethod.GET)
    @ApiOperation(value = "Get mentors by area", notes = "Returns all the mentors based on the area")
    List<User> findByAreaInAndUserType(@RequestParam("area") List<String> areas) {
        return userRepository.findByAreaInAndUserType(areas, "mentor");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "Verify user login", notes = "Returns the matching user")
    User loginUser(@RequestParam String userId, @RequestParam String password) {
       /* String encodedPassword = bCryptPasswordEncoder.encode(password);*/
        User user = null;
        user = userRepository.findOne(userId);

        if (user != null) {
            if (!user.getPassword().equals(password)){
                user = null;
            }
        }
        return user;
    }
}
