package com.example.restful.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restful.bean.User;
import com.example.restful.dao.UserDao;

import java.util.List;

/**
 *
 * Title: UserServiceImpl
 * Description:
 * 用户操作实现类
 * Version:1.0.0
 * @author pancm
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try{
            userDao.deleteUser(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
