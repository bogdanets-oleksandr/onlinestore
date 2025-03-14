package io.teamchallenge.service.impl;

import io.teamchallenge.dto.address.AddressDto;
import io.teamchallenge.dto.user.UserProfile;
import io.teamchallenge.entity.Address;
import io.teamchallenge.entity.User;
import io.teamchallenge.exception.ConflictException;
import io.teamchallenge.exception.NotFoundException;
import io.teamchallenge.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static io.teamchallenge.constant.ExceptionMessage.USER_NOT_FOUND_BY_EMAIL;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public UserProfile getUserProfile(String email) {
        System.out.println("getUserProfile");
        return userRepository.findUserByEmail(email)
                .map(user -> modelMapper.map(user, UserProfile.class))
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_EMAIL.formatted(email)));
    }
    @Transactional
    public UserProfile updateUserProfile(String email, UserProfile userProfile) {
        // Check if email is already taken by another user
        if (!userProfile.getEmail().equals(email) && userRepository.existsByEmail(userProfile.getEmail())) {
            throw new ConflictException("User with email " + userProfile.getEmail() + " already exists");
        }
        User user = userRepository.findUserByEmail(email)
                .orElseThrow(() -> new NotFoundException(USER_NOT_FOUND_BY_EMAIL.formatted(email)));
        user.setFullName(userProfile.getFullName());
        user.setPhoneNumber(userProfile.getPhoneNumber());
        user.setSecondaryPhoneNumber(userProfile.getSecondaryPhoneNumber());
        user.setEmail(userProfile.getEmail());
        user.setBirthdate(userProfile.getBirthdate());
        if (user.getAddress() == null) {
            user.setAddress(new Address());
        }
        if (userProfile.getAddress() == null) {
            userProfile.setAddress(new AddressDto());
        }
        user.getAddress().setCity(userProfile.getAddress().getCity());
        user.getAddress().setAddressLine(userProfile.getAddress().getAddressLine());
        user.setSex(userProfile.getSex());
        userRepository.save(user);
        return getUserProfile(user.getEmail());
    }
}
