package com.taskagile.infrastructure.repository;

import com.taskagile.domain.model.user.User;
import com.taskagile.domain.model.user.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@DataJpaTest
public class HibernateUserRepositoryTests {

  @TestConfiguration
  public static class UserRepositoryTestContextConfiguration{
    @Bean
    public UserRepository userRepository(EntityManager entityManager){
      return new HibernateUserRepository(entityManager);
    }
  }


  @Autowired
  private UserRepository repository;

  @Test(expected= PersistenceException.class)
  public void save_nullUsernameUser_shouldFail(){
    User invalidUser = User.create(null, "hyukje2733@naver.com","Mypassword!");
    repository.save(invalidUser);
  }
}
