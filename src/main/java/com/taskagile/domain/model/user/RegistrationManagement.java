package com.taskagile.domain.model.user;

import com.taskagile.domain.common.security.PasswordEncryptors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RegistrationManagement {
  private UserRepository repository;
  private PasswordEncryptors passwordEncryptors;

  public RegistrationManagement(@Qualifier("hibernateUserRepository") UserRepository repository, PasswordEncryptors passwordEncryptors ){
    this.repository = repository;
    this.passwordEncryptors = passwordEncryptors;
  }

  public User register(String username, String emailAddress, String password) throws UsernameExistsException, EmailAddressExistsException {
    User existingUser = repository.findByUsername(username);
    if(existingUser!=null){
      throw new UsernameExistsException();
    }

    existingUser = repository.findByEmailAddress(emailAddress.toLowerCase());
    if(existingUser!=null){
      throw new EmailAddressExistsException();
    }

    String encryptedPassword = passwordEncryptors.encrypt(password);
    User newUser = User.create(username, emailAddress.toLowerCase(), encryptedPassword);
    repository.save(newUser);
    return newUser;
  }
}
