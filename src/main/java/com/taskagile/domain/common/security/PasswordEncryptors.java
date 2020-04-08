package com.taskagile.domain.common.security;

public interface PasswordEncryptors {

  /**
   * Encrypt a raw password
   */
  String encrypt(String rawPassword);
}
