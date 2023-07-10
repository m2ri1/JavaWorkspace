package hello.hellosping.service;

import hello.hellosping.aop.TimeTraceAop;
import hello.hellosping.repository.JpaMemberRepository;
import hello.hellosping.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);}

//    @Bean
//    private MemberRepository memberRepository() {
//        return  new JpaMemberRepository(em);
//    }
}
