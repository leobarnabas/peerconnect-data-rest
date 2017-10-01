package org.pcg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.pcg.model.User;
import org.pcg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get all users", notes = "Returns all the users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Insert user", notes = "Returns inserted user")
    User saveUser(@RequestBody @Valid User user) {
        return userRepository.insert(user);
    }
}
