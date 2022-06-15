package com.mojjadev.jpastudy;

import com.mojjadev.jpastudy.domain.Member;
import com.mojjadev.jpastudy.domain.MemberRepository;
import com.mojjadev.jpastudy.domain.ORDERTYPE;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaStudyApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(MemberRepository repository) {
//        return (args) -> {
//            Member member = new Member();
//            repository.save(member.builder().name("123").description("123").type(ORDERTYPE.ADMIN).build());
//        };
//    }

}
