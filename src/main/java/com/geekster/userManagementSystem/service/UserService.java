package com.geekster.userManagementSystem.service;

import com.geekster.userManagementSystem.model.User;
import com.geekster.userManagementSystem.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAllUser(){
        return userDao.getAll();
    }

    public  User getUserById(String userId){
        if(userId != null){
            List<User>allUserList=userDao.getAll();
            for(User user:allUserList){
                if(user.getUserId().equals(userId)){
                    return user;
                }
            }
        }
        return null;
    }

    public String addUser(User user){
        boolean addUserToList = userDao.add(user);
        if(addUserToList){
            return "user is added !!!";
        }
        else{
            return "user is not added !!!";
        }
    }
    String status;
    public String deleteUserById(String userId){
        if(userId != null){
            List<User>allUserList=userDao.getAll();
            for(User user:allUserList){
                if(user.getUserId().equals(userId)){
                    boolean deleterUser = userDao.remove(user);
                    if(deleterUser) {
                        return "user with id "+ userId +" was deleted successfully !!!";
                    }
                    else {
                        return "user with id "+ userId +" was not deleted !!!";
                    }

                }
            }
            return "user is not found .... Database Error";
        }
        return "Invalid Id.... Can not accept Null Id !!!";
    }

    public String updateUserInfo(String userId,String email, String phoneNo) {
        boolean updateUserInfo= userDao.updateUser(userId,email,phoneNo);
        if(updateUserInfo) {
            return "user with id " + userId + " was updated successfully!!!";
        }
        else {
            return "user with id " + userId + " does not exist !!!";
        }
    }
}


