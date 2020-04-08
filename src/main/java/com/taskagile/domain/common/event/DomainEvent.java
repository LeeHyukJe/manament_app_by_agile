package com.taskagile.domain.common.event;

import org.springframework.context.ApplicationEvent;

public class DomainEvent extends ApplicationEvent {
  public DomainEvent(Object source){
    super(source);
  }
  public long occuredAt(){
    // 잠재적인 구현체의 타임스탬프를 반환한다.
    return getTimestamp();
  }
}
