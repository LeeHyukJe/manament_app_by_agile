package com.taskagile.domain.application.commands;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class RegistrationCommand {
  private String username;
  private String emailAddress;
  private String password;

  public RegistrationCommand(String username, String emailAddress, String password){
    this.username = username;
    this.emailAddress = emailAddress;
    this.password = password;
  }
}
