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
    return passwordEncoder.encode(rawPassword);
  }
}
