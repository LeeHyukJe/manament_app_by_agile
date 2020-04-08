package com.taskagile.domain.common.security;

import org.springframework.stereotype.Component;

@Component
public class PasswordEncryptorsDelegator implements PasswordEncryptors {
  @Override
  public String encrypt(String rawPassword) {
    //TODO 이 부분 구현하
    return rawPassword;
  }
}
