package com.taskagile.domain.common.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncryptorsDelegator implements PasswordEncryptors {

  private PasswordEncoder passwordEncoder;
  public PasswordEncryptorsDelegator(PasswordEncoder passwordEncoder){
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public String encrypt(String rawPassword) {
    //TODO 이 부분 구현하
    return passwordEncoder.encode(rawPassword);
  }
}
