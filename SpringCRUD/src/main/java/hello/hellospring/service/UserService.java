package hello.hellospring.service;

import hello.hellospring.DTO.UserDTO;
import hello.hellospring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO insertUser(UserDTO user) {
        return userRepository.insertUser(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserById(String Id) {
        return userRepository.getUserByUserID(Id);
    }

    public void updateUserPw(String userId, UserDTO user) {
        userRepository.updateUserPwd(userId, user);

    }

    public void deleterUser(String Id) {
        userRepository.deleteUser(Id);
    }


}
