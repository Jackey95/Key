package com.example.responseentity;

import com.example.swagger.SwaggerUser;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private static List<SwaggerUser> list = Arrays.asList(
            new  SwaggerUser("张三","123"),
            new  SwaggerUser("李四","789"),
            new  SwaggerUser("王五","456")
    );
    public List<SwaggerUser> findAllUsers(){
        return list;
    }

    public SwaggerUser findUserByName(String username){
        for (SwaggerUser user:list){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
