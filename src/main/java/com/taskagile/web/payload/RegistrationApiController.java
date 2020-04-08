package com.taskagile.web.payload;

import com.taskagile.domain.model.user.EmailAddressExistsException;
import com.taskagile.domain.model.user.RegistrationException;
import com.taskagile.domain.model.user.UserService;
import com.taskagile.domain.model.user.UsernameExistsException;
import com.taskagile.web.results.ApiResult;
import com.taskagile.web.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationApiController {
  private UserService service;

  public RegistrationApiController(UserService service){
    this.service = service;
  }

  @PostMapping("/api/registrations")
  public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload){
    try{
      service.register(payload.toCommand());
      return Result.created();
    }catch (RegistrationException e){
      String errorMessage = "Registration failed";
      if(e instanceof UsernameExistsException){
        errorMessage = "Username already exists";
      }else if(e instanceof EmailAddressExistsException){
        errorMessage = "Email address already exists";
      }
      return Result.failure(errorMessage);
    }
  }

}
