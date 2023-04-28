package com.geekster.userManagementSystem.repository;

import com.geekster.userManagementSystem.model.User;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    private List<User> userList;

    public UserDao(){
        userList= new ArrayList<>();
        userList.add(new User("0","user","1999-11-15", "rajdhaka200@gmail.com" ,"+91 9587567782", LocalDate.now().toString(), LocalTime.now().toString()));
    }
    public List<User> getAll(){
        return userList;
    }
    public boolean add(User user){
        userList.add(user);
        return true;
    }
    public boolean remove(User user){
        userList.remove(user);
        return true;
    }

    public boolean updateUser(String userId, String email, String phoneNo) {
        for (User user : userList) {
            if (user.getUserId().equals(userId)) {
                userList.remove(user);
                user.setEmail(email);
                user.setPhoneNo(phoneNo);
                userList.add(user);
                return true;
            }
        }
        return false;
    }

}
