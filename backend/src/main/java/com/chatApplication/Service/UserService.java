package com.chatApplication.Service;

import java.util.List;

import com.chatApplication.Exception.UserException;
import com.chatApplication.Model.User;
import com.chatApplication.Payload.UpdateUserRequest;

public interface UserService {

    public User findUserById(Integer id) throws UserException;

    public User findUserProfile(String jwt) throws UserException;

    public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;

    public List<User> searchUser(String query);
}
