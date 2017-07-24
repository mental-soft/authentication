package com.teammental.authentication.controller;

import com.teammental.authentication.dto.LoginResult;
import com.teammental.mebuilder.GenericBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bu controller giriş ekranı için kullanılır.
 * Created by coskun on 25.07.2017.
 */
@RestController
public class LoginController {

  /**
   * Login controller.
   * @return LoginResult
   */
  @RequestMapping("/login")
  public LoginResult login() {
    LoginResult loginResult = GenericBuilder.of(LoginResult::new)
        .with(LoginResult::setId, "coskun")
        .with(LoginResult::setAttributes, "attr")
        .build();
    return loginResult;
  }


}
