package org.koreait.configs;

import org.koreait.person.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBComfig {
    @Bean
    public Greeter dataSource(){
        return new Greeter();
    }

    /*
    @Bean
    public MemberDao memberDao(){
        System.out.println("수동 등록 Bean");
        return new MemberDao();
    }*/
}
