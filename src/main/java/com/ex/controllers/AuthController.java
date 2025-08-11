package com.ex.controllers;

import java.util.Collections;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ex.dto.AuthRequest;
import com.ex.dto.UserDTO;
import com.ex.service.AuthService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

@Autowired
private AuthService authService;

@PostMapping("/register")//register
public ResponseEntity<UserDTO> register(@Valid @RequestBody UserDTO userDTO) 
{
System.out.println("Enterted into AuthService Register Method");
UserDTO saved = authService.register(userDTO);
return ResponseEntity.ok(saved);
}

@PostMapping("/login")//login
public ResponseEntity<Map<String, String>> login(@Valid @RequestBody AuthRequest request) 
{
String token = authService.login(request);
return ResponseEntity.ok(Collections.singletonMap("token", token));
}
}