package io.teamchallenge.mapper;

import io.teamchallenge.dto.security.SignUpRequestDto;
import io.teamchallenge.entity.User;
import io.teamchallenge.enumerated.Role;
import io.teamchallenge.service.impl.JwtService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.AbstractConverter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Mapper for {@link SignUpRequestDto}.
 * @author Denys Liubchenko
 */
@Component
@RequiredArgsConstructor
public class SignUpRequestDtoToUserMapper extends AbstractConverter<SignUpRequestDto, User> {
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    /**
     * Converts a {@link SignUpRequestDto} object to an {@link User} entity.
     *
     * @param signUpRequestDto The {@link SignUpRequestDto} object to be converted.
     * @return The converted {@link User} object.
     */
    protected User convert(SignUpRequestDto signUpRequestDto) {
        return User.builder()
            .email(signUpRequestDto.getEmail())
            .password(passwordEncoder.encode(signUpRequestDto.getPassword()))
            .phoneNumber(signUpRequestDto.getPhoneNumber())
            .fullName(signUpRequestDto.getFullName())
            .role(Role.ROLE_USER)
            .refreshTokenKey(jwtService.generateTokenKey())
            .build();
    }
}
