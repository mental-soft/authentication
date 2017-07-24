package com.teammental.authentication.service;

import com.teammental.authentication.dto.LoginDto;

/**
 * Created by coskun on 25.07.2017.
 */
public interface LoginService {

  int login(LoginDto loginDto);

}
