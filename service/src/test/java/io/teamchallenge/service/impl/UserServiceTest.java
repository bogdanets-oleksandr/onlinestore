package io.teamchallenge.service.impl;

import io.teamchallenge.dto.user.UserVO;
import io.teamchallenge.enumerated.Role;
import io.teamchallenge.exception.NotFoundException;
import io.teamchallenge.repository.UserRepository;
import io.teamchallenge.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getUserProfile_UserExists_ReturnsUserVO() {
        // Arrange
        String email = "test@example.com";
        User user = new User();
        user.setId(1L);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail(email);
        user.setRole(Role.valueOf("ROLE_USER"));

        when(userRepository.findUserByEmail(email)).thenReturn(Optional.of(user));

        // Act
        UserVO result = userService.getUserProfile(email);

        // Assert
        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals(user.getFirstName(), result.getFirstName());
        assertEquals(user.getLastName(), result.getLastName());
        assertEquals(user.getEmail(), result.getEmail());
        assertEquals(user.getRole(), result.getRole());
    }

    @Test
    void getUserProfile_UserDoesNotExist_ThrowsNotFoundException() {
        // Arrange
        String email = "nonexistent@example.com";

        when(userRepository.findUserByEmail(email)).thenReturn(Optional.empty());

        // Act & Assert
        NotFoundException exception = assertThrows(NotFoundException.class, () -> {
            userService.getUserProfile(email);
        });

        assertEquals("There is no user with email: " + email, exception.getMessage());
    }
}
