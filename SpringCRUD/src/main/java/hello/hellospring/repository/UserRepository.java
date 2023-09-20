package hello.hellospring.repository;

import hello.hellospring.DTO.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    static public ArrayList<UserDTO> users;

    static {
        users = new ArrayList<>();
        users.add(new UserDTO("miri", "test1", "1234"));
        users.add(new UserDTO("mori", "test2", "2345"));
        users.add(new UserDTO("mari", "test3", "3456"));

    }

    public UserDTO insertUser(UserDTO user) {
        users.add(user);
        return user;

    }

    public List<UserDTO> getAllUsers() {
        return users;
    }

    public UserDTO getUserByUserID(String ID) {
        return users.stream()
            .filter(UserDTO -> UserDTO.getID().equals(ID))
                .findAny()
                .orElse(new UserDTO("", "", ""));

    }

    public void updateUserPwd(String ID, UserDTO user) {
         users.stream()
                .filter(UserDTO -> UserDTO.getID().equals(ID))
                .findAny()
                .orElse(new UserDTO("", "", ""))
                 .setPwd(user.getPwd());

    }

    public void deleteUser(String ID) {
        users.removeIf(userDTO -> userDTO.getID().equals(ID));
    }

}
