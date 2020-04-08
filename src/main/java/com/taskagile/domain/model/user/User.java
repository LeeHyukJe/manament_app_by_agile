package com.taskagile.domain.model.user;


import com.taskagile.domain.common.model.AbstractBaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Setter
@Getter
@ToString
@Entity
@Table(name="user")
@NoArgsConstructor
public class User extends AbstractBaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="username", nullable = false, length = 50, unique = true)
  private String username;
  @Column(name="email_address", nullable = false, length = 100, unique = true)
  private String emailAddress;
  @Column(name="password", nullable = false, length = 30)
  private String password;
  @Column(name = "first_name", nullable = false, length = 45)
  private String firstName;
  @Column(name = "last_name", nullable = false, length = 45)
  private String lastName;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date", nullable = false)
  private Date createdDate;

  public static User create(String username, String emailAddress, String password){
    User user = new User();
    user.username = username;
    user.emailAddress = emailAddress;
    user.password = password;
    user.firstName = "";
    user.lastName = "";
    user.createdDate  = new Date();
    return user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return Objects.equals(username, user.username) &&
      Objects.equals(emailAddress, user.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, emailAddress);
  }

}
