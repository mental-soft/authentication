package com.teammental.authentication.helper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Password encode and match functions.
 */
public class PasswordHelper {

  /**
   * Encode a string to coded string.
   * @param password password
   * @return coded string of password
   */
  public static String encodePassword(String password) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    return passwordEncoder.encode(password);
  }

  /**
   * Match password with encoded password.
   * @param password password
   * @param encodedPassword encoded password
   * @return true if matches
   */
  public static boolean matchPassword(String password, String encodedPassword) {
    return new BCryptPasswordEncoder().matches(password, encodedPassword);
  }

}
