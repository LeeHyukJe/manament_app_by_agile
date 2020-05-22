package com.taskagile.domain.common.mail;

import javax.mail.Message;

public interface Mailer {

  void send(Message message);
}
