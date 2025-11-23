package dev.himbra.taskmanagerapp.services;

import dev.himbra.taskmanagerapp.dtos.Response;
import dev.himbra.taskmanagerapp.dtos.UserRequest;
import dev.himbra.taskmanagerapp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public Response<?> SignUp(UserRequest userRequest) {
        return null;
    }

    @Override
    public Response<?> SignIn(UserRequest userRequest) {
        return null;
    }

    @Override
    public User getProfile() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
