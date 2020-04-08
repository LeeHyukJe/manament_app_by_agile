package com.taskagile.domain.model.user;


import com.taskagile.domain.model.user.events.UserRegisteredEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class UserRegisteredEventHandler {

  @EventListener(UserRegisteredEvent.class)
  public void handleEvent(UserRegisteredEvent event){
    log.debug("handling `{}` registration event", event.getUser().getEmailAddress());
  }
}
