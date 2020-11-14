package com.mersiades.awcdata.services.impl;

import com.mersiades.awcdata.models.User;
import com.mersiades.awcdata.repositories.UserReactiveRepository;
import com.mersiades.awcdata.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceImplTest {

    public static final String MOCK_USER_ID_1 = "mock-user-id-1";
    public static final String DISCORD_USER_ID_1 = "696484065859076146";

    @Mock
    UserReactiveRepository userRepository;

    UserService userService;

    User mockUser1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        mockUser1 = User.builder()
                .id(MOCK_USER_ID_1)
                .discordId(DISCORD_USER_ID_1)
                .build();

        userService = new UserServiceImpl(userRepository);
    }

    @Test
    void shouldFindAllUsers() {
        // Given
        User mockUser2 = User.builder().build();
        when(userRepository.findAll()).thenReturn(Flux.just(mockUser1, mockUser2));

        // When
        List<User> returnedUsers = userService.findAll().collectList().block();

        // Then
        assert returnedUsers != null;
        assertEquals(2, returnedUsers.size());
        verify(userRepository, times(1)).findAll();
    }

    @Test
    void shouldFindUserById() {
        // Given
        when(userRepository.findById(anyString())).thenReturn(Mono.just(mockUser1));

        // When
        User returnedUser = userService.findById(MOCK_USER_ID_1).block();

        // Then
        assert returnedUser != null;
        assertEquals(MOCK_USER_ID_1, returnedUser.getId());
        verify(userRepository, times(1)).findById(anyString());
    }

    @Test
    void shouldSaveUser() {
        // Given
        when(userRepository.save(any(User.class))).thenReturn(Mono.just(mockUser1));

        // When
        User savedUser = userService.save(mockUser1).block();

        // Then
        assert savedUser != null;
        assertEquals(mockUser1.getId(), savedUser.getId());
        verify(userRepository, times(1)).save(any(User.class));
    }

//    @Test
//    void shouldSaveAllUsers() {
//    }

    @Test
    void shouldDeleteUser() {
        // When
        userService.delete(mockUser1);

        // Then
        verify(userRepository, times(1)).delete(any(User.class));
    }

    @Test
    void shouldDeleteUserById() {
        // When
        userService.deleteById(MOCK_USER_ID_1);

        // Then
        verify(userRepository, times(1)).deleteById(anyString());
    }

    @Test
    void shouldFindUserByDiscordId() {
        // Given
        when(userRepository.findByDiscordId(anyString())).thenReturn(Mono.just(mockUser1));

        // When
        User returnedUser = userService.findByDiscordId(DISCORD_USER_ID_1).block();

        // Then
        assert returnedUser != null;
        assertEquals(mockUser1.getId(), returnedUser.getId());
        verify(userRepository, times(1)).findByDiscordId(anyString());
    }
}