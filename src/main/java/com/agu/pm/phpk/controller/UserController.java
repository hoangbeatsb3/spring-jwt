package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Student;
import com.agu.pm.phpk.model.User;
import com.agu.pm.phpk.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDetailsServiceImpl service;

    @GetMapping("")
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @PutMapping("" +
            "")
    public void updateStudent(@RequestBody() User user) {
        service.updateUser(user);
    }

    @DeleteMapping("")
    public void deleteUser(@RequestParam("id") Integer id) {
        service.deleteUser(id);
    }
}
