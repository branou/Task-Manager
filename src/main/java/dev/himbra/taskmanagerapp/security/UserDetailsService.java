package dev.himbra.taskmanagerapp.security;

import dev.himbra.taskmanagerapp.entity.User;
import dev.himbra.taskmanagerapp.exceptions.NotFoundException;
import dev.himbra.taskmanagerapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final UserRepository userRepository;
    public UserDetails loadUserByUsername(String username) {
        User user= userRepository.findByUsername(username)
                .orElseThrow(() -> new NotFoundException("User not found with username: " + username));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
