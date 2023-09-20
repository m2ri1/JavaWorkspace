package hello.hellospring.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class UserDTO {

    private String ID, name, pwd;

    UserDTO() {

    }


}
