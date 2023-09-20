package hello.hellospring.controller;
import hello.hellospring.domain.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("miri")

    public Hello helloApi(@RequestParam("name") String name, String mbti, String birth) {
        Hello hello = new Hello();
        hello.setBirth(birth);
        hello.setName(name);
        hello.setMbti(mbti);
        return hello;
    }
}