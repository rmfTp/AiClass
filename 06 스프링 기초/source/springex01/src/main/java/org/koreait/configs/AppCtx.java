package org.koreait.configs;

import org.koreait.person.Greeter;
import org.springframework.context.annotation.Bean;

//@Configuration //Greeter가 2개라 에러
public class AppCtx {
    @Bean
    public Greeter greeter(){
        return new Greeter();
    }
}
