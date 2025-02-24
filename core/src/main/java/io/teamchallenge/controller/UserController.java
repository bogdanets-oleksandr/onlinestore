package io.teamchallenge.controller;

import io.teamchallenge.dto.user.UserProfile;
import io.teamchallenge.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/profile")
    public ResponseEntity<UserProfile> getUserProfile(Principal principal) {
        String email = getUserEmailFromPrincipal(principal);
        return ResponseEntity.ok(userService.getUserProfile(email));
    }

    @PutMapping("/users/profile")
    public ResponseEntity<UserProfile> updateUserProfile(Principal principal, @RequestBody UserProfile userProfile) {
        String email = getUserEmailFromPrincipal(principal);
        return ResponseEntity.ok(userService.updateUserProfile(email, userProfile));
    }

    private String getUserEmailFromPrincipal(Principal principal) {
        return principal.getName();
    }
}
