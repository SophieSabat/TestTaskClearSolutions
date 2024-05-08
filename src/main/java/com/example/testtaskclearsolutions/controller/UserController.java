package com.example.testtaskclearsolutions.controller;

import com.example.testtaskclearsolutions.dto.User;
import com.example.testtaskclearsolutions.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService service;
    private List<User> usersList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        service.create(usersList, user);

        return new ResponseEntity<>("The user created successful (>‿◠)✌", HttpStatus.CREATED);
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<String> updateSomeUserFields(@PathVariable Long userId, @RequestBody User user) {


        return new ResponseEntity<>("Some users fields were updated (>‿◠)✌", HttpStatus.FOUND);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateAllUserFields(@PathVariable Long userId) {

        return new ResponseEntity<>("All users fields were updated (>‿◠)✌", HttpStatus.FOUND);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {

        return new ResponseEntity<>("The user deleted successful (>‿◠)✌", HttpStatus.OK);

    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> searchForUsers(@PathVariable Long userId) {

//        return new ResponseEntity<>("The user created successful", HttpStatus.CREATED);
        return null;
    }

}
