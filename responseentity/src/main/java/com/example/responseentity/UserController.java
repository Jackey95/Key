package com.example.responseentity;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/{id}")
    public ResponseData getUser(@PathVariable int id){
        User user=UserDao.finUserById(id);
        return new ResponseData("200",null,true,user);
    }
    @GetMapping("")
    public ResponseData getAllUsers(){
        Map<Integer,User>users=UserDao.findAllUsers();
        return new ResponseData("200",null,true,users);
    }
    @PostMapping("")
    public ResponseData addUser(@RequestBody User user){
        UserDao.addUser(user);
        return new ResponseData("200",null,true,null);
    }
    @PutMapping("")
    public ResponseData updateUser(@RequestBody User user){
        UserDao.updaterUser(user);
        return new ResponseData("200",null,true,null);
    }
    @DeleteMapping("/{id}")
    public ResponseData deleteUser(@PathVariable int id){
        UserDao.deleteUser(id);
        return new ResponseData("200",null,true,null);
    }
}
