package dev.himbra.taskmanagerapp.services;

import dev.himbra.taskmanagerapp.dtos.Response;
import dev.himbra.taskmanagerapp.dtos.UserRequest;
import dev.himbra.taskmanagerapp.entity.User;

public interface UserService {
    public Response<?> SignUp(UserRequest userRequest);
    public Response<?> SignIn(UserRequest userRequest);
    public User getProfile();
}
