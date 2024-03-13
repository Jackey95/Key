package com.example.responseentity;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<Integer,User> users=new HashMap<Integer,User>();
    static {
        users.put(1,new User(1,"张三","123"));
        users.put(2,new User(2,"李四","123456"));
    }
    public static Map<Integer,User> findAllUsers(){
        return users;
    }
    public static User finUserById(int id){
        return users.get(id);
    }
    public static void addUser(User user){
        users.put(user.getId(),user);
    }
    public static void updaterUser(User user){
        users.put(user.getId(),user);
    }
    public static void deleteUser(int id){
        users.remove(id);
    }
}
