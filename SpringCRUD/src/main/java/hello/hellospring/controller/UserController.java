package hello.hellospring.controller;

import hello.hellospring.DTO.UserDTO;
import hello.hellospring.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public UserDTO insertUser(@RequestBody UserDTO user) {
        return userService.insertUser(user);

    }

    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{Id}")
    public UserDTO getUserByUserId(@PathVariable String Id) {
        return userService.getUserById(Id);
    }

    @PutMapping("/{Id}")
    public void updateUserPw(@PathVariable String Id,@RequestBody UserDTO user) {
        userService.updateUserPw(Id, user);
    }

    @DeleteMapping("/{Id}")
    public void userDelete(@PathVariable String Id) {
        userService.deleterUser(Id);
    }

}
