package com.teammental.authentication.dto;

/**
 * Login sonucundaki bilgileri Apereo Cas için sağlar.
 * Created by coskun on 25.07.2017.
 */
public class LoginResult {
  private String id;
  private String attributes;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }

  @Override
  public String toString() {
    return "ClassLoginResult [id = " + id + ", attributes = " + attributes + "]";
  }

}
