package com.taskagile.domain.model.user;

import com.taskagile.domain.common.security.PasswordEncryptors;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RegistrationManagementTests {

  private UserRepository repositoryMock;
  private PasswordEncryptors passwordEncryptMock;
  private RegistrationManagement instance;

  @Before
  public void setUp() {
    repositoryMock = mock(UserRepository.class);
    passwordEncryptMock = mock(PasswordEncryptors.class);
    instance = new RegistrationManagement(repositoryMock, passwordEncryptMock);
  }

  @Test(expected = UsernameExistsException.class)
  public void register_existsUsername_shouldFail() throws Exception{
    String username = "existUsername";
    String emailAddress = "hyukje@taskagile.com";
    String password = "Mypassword!";

    // 이미 존재하는 사용자임을 알려주고자 빈 객체를 반환한다.
    when(repositoryMock.findByUsername(username)).thenReturn(new User());
    instance.register(username, emailAddress, password);
  }

  @Test
  public void register_uppercaseEmailAddress_shouldSuccessAndBecomeLowerCase() throws RegistrationException{
    String username = "hyukje";
    String emailAddress = "hyukje@TaskAgile.com";
    String password = "Mypassword!";
    instance.register(username, emailAddress, password);
    User userToSave = User.create(username, emailAddress.toLowerCase(), password);
    verify(repositoryMock).save(userToSave);

  }

  @Test
  public void register_newUser_shouldSucceed() throws Exception{
    String username="hyukje";
    String emailAddress = "hyukje2733@naver.com";
    String password = "MyPassword";
    String encryptedPassword = "EncryptedPassword";
    User newUser = User.create(username, emailAddress, encryptedPassword);

    // 레파지토리 목 설정
    // 사용자가 존재하지 않음을 나타내고자 null 반환
    when(repositoryMock.findByUsername(username)).thenReturn(null);
    when(repositoryMock.findByEmailAddress(emailAddress)).thenReturn(null);
    doNothing().when(repositoryMock).save(newUser);
    // passwordEncryptor 목 설정
    when(passwordEncryptMock.encrypt(password)).thenReturn("EncryptedPassword");

    User savedUser = instance.register(username, emailAddress, password);
    InOrder inOrder = inOrder(repositoryMock);

    inOrder.verify(repositoryMock).findByUsername(username);
    inOrder.verify(repositoryMock).findByEmailAddress(emailAddress);
    inOrder.verify(repositoryMock).save(newUser);
    verify(passwordEncryptMock).encrypt(password);
    assertEquals("Save user's password should be encrypted", encryptedPassword, savedUser.getPassword());
  }
}
