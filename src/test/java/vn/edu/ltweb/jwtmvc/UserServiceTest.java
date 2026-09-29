package vn.edu.ltweb.jwtmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import vn.edu.ltweb.jwtmvc.user.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest @ActiveProfiles("test")
class UserServiceTest {
 @Autowired UserService users; @Autowired AppUserRepository repository;
 @Test void registersUserWithBCryptPasswordAndSafeResponse() {
  UserResponse response=users.register(new RegisterRequest("Ada Lovelace","ada@example.com","password123"));
  AppUser stored=repository.findByEmail("ada@example.com").orElseThrow();
  assertThat(stored.getPassword()).isNotEqualTo("password123"); assertThat(users.passwordMatches("password123",stored.getPassword())).isTrue();
  assertThat(response.email()).isEqualTo("ada@example.com");
 }
 @Test void rejectsDuplicateEmail() { var r=new RegisterRequest("Ada","dupe@example.com","password123"); users.register(r); assertThatThrownBy(()->users.register(r)).isInstanceOf(DuplicateEmailException.class); }
}
