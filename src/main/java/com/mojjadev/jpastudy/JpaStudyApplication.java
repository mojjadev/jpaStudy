package com.mojjadev.jpastudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
