package hu.unideb.inf.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getllAllUser(){
        return (List<User>) userRepo.findAll();
    }

    public void save(User user) {
        userRepo.save(user);
    }

    public User get(Integer id) throws UserNotFoundException {
        Optional<User> result = userRepo.findById(id);

        if (result.isPresent()){
            return result.get();
        }

        throw new UserNotFoundException("Nincs ilyen felhasználó ezzel az ID-vel " + id);

    }

    public void delete(Integer id) throws UserNotFoundException {
        Long count = userRepo.countById(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Nincs ilyen felhasználó ezzel az ID-vel " + id);
        }
        userRepo.deleteById(id);
    }
}
