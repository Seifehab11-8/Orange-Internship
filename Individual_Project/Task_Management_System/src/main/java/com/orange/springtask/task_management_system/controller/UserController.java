package com.orange.springtask.task_management_system.controller;

import com.orange.springtask.task_management_system.service.UserService;
import com.orange.springtask.task_management_system.service.dto.request.UserRequest;
import com.orange.springtask.task_management_system.service.dto.response.UserResponse;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody UserRequest userRequest) {
        try {
            return new ResponseEntity<>(userService.acceptRegisterRequest(userRequest),
                    HttpStatus.CREATED);
        } catch (SQLIntegrityConstraintViolationException e) {
            return new ResponseEntity<>((HttpStatus.BAD_REQUEST));
        }
    }
}
