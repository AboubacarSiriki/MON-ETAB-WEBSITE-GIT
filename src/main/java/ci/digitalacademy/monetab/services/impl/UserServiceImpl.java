package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //private final Logger log = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {

        log.debug("Request to update {}",user);
       // return userRepository.findById(user.getId())
        //        .map(existingUser->{
           //         existingUser.setPassword(user.getPassword());
              //      return existingUser;
             //   }).map(existingUser->{
               //     return save(existingUser);
             //   }).orElseThrow(()->new IllegalArgumentException());

        Optional<User>optionalUser=findOne(user.getId());//recupertion d'un Optional<User>
        if(optionalUser.isPresent()){ //verification de l'existance d'un contenu dans le optimal
            User userToUpdate = optionalUser.get(); //declaration + affection d'u user à partir du optimal
            userToUpdate.setPassword(user.getPassword()); //mise à jour du pseud
            userToUpdate.setSpeudo(user.getSpeudo());//mise à jour du pseud

            log.info("Request to update user in progress");

            return save(userToUpdate); //enregistrement de l'utilisateur
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<User> findOne(Long id) {
        log.debug("Request to find one user {}",id);
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        log.debug("Request to find All users");
        return userRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        log.debug("Request to delete user {}",id);
        userRepository.deleteById(id);
    }


}
