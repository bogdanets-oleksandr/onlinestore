package io.teamchallenge.service.impl;

import io.teamchallenge.dto.user.UserVO;
import io.teamchallenge.exception.NotFoundException;
import io.teamchallenge.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static io.teamchallenge.constant.ExceptionMessage.USER_NOT_FOUND_BY_EMAIL;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserVO getUserProfile(String email) {
        return userRepository.findUserByEmail(email)
                .map(user -> UserVO.builder()
                        .id(user.getId())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .email(user.getEmail())
                        .role(user.getRole())
                        .build())
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_EMAIL.formatted(email)));
    }
}
