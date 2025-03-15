package io.teamchallenge.service.impl;

import io.teamchallenge.dto.address.AddressDto;
import io.teamchallenge.dto.user.UserProfile;
import io.teamchallenge.dto.user.UserProfilePOST;
import io.teamchallenge.entity.Address;
import io.teamchallenge.entity.User;
import io.teamchallenge.exception.ConflictException;
import io.teamchallenge.exception.NotFoundException;
import io.teamchallenge.repository.ProductRepository;
import io.teamchallenge.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static io.teamchallenge.constant.ExceptionMessage.USER_NOT_FOUND_BY_EMAIL;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

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
    @Transactional
    public UserProfile createUserProfile(String email, UserProfilePOST userProfile) {
        if (userRepository.existsByEmail(userProfile.getEmail())) {
            throw new ConflictException("User with email " + userProfile.getEmail() + " already exists");
        }
        log.info("Creating user profile for email: {} by admin user with email: {}", userProfile.getEmail(), email);
        User user = modelMapper.map(userProfile, User.class);
        user.setPassword(passwordEncoder.encode(userProfile.getPassword()));
        user.setRefreshTokenKey(jwtService.generateTokenKey());
        userRepository.save(user);
        return getUserProfile(user.getEmail());
    }

    public Optional<User> getUser(String name) {
        return userRepository.findUserByEmail(name);
    }
    @Transactional
    public void addProductToWishlist(String name, Long productId) {
        User user = userRepository.findUserByEmail(name)
                .orElseThrow(() -> new ConflictException("User with email " + name + " not found"));
        user.getWishlists().add(productRepository.findById(productId)
                .orElseThrow(() -> new ConflictException("Product with id " + productId + " not found")));
        userRepository.save(user);
    }
    @Transactional
    public void removeProductFromWishlist(String name, Long productId) {
        User user = userRepository.findUserByEmail(name)
                .orElseThrow(() -> new ConflictException("User with email " + name + " not found"));
        user.getWishlists().remove(productRepository.findById(productId)
                .orElseThrow(() -> new ConflictException("Product with id " + productId + " not found")));
        userRepository.save(user);
    }
}
