package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatusCode.valueOf(200));
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
            List<User> users =userService.getAllUsers();
            return new ResponseEntity<>(users,HttpStatus.OK);
    }

   @PutMapping("{id}")
   public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,@RequestBody User user){
        user.setId(userId);
        User updatedUser =userService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);

   }

   @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUSer(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>("success",HttpStatus.OK);
   }


}
