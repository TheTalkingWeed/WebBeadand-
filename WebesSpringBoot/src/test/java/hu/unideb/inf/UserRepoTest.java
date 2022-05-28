//package hu.unideb.inf;
//
//import hu.unideb.inf.user.User;
//import hu.unideb.inf.user.UserRepo;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import javax.persistence.Table;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//public class UserRepoTest {
//    @Autowired
//    private UserRepo userRepo;
//
//    @Test
//    public void testNew(){
//        User user = new User();
//        user.setEmail("xyz@gmail.com");
//        user.setPassword("passforxyz");
//        user.setFirstName("Jhon");
//        user.setLastName("Smith");
//
//        User savedUser = userRepo.save(user);
//
//
//
//
//
//    }
//}
