package com.taskagile.domain.model.user;

import com.taskagile.domain.application.commands.RegistrationCommand;

public interface UserService {
  void register(RegistrationCommand command) throws RegistrationException;
}
