package io.teamchallenge.controller;

import io.teamchallenge.dto.user.UserVO;
import io.teamchallenge.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/profile")
    public ResponseEntity<UserVO> getUserProfile(Principal principal) {
        String email = getUserEmailFromPrincipal(principal);
        return ResponseEntity.ok(userService.getUserProfile(email));
    }

    private String getUserEmailFromPrincipal(Principal principal) {
        return principal.getName();
    }
}
