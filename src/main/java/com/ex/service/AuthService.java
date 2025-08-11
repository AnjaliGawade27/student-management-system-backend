package com.ex.service;

import com.ex.dto.AuthRequest;
import com.ex.dto.UserDTO;

public interface AuthService 
{
UserDTO register(UserDTO dto);
String login(AuthRequest request);
}