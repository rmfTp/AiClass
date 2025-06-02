package org.koreait.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
/*@ComponentScan(basePackages = "org.koreait",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class))*/

//@ComponentScan(basePackages = "org.koreait",
//    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MemberDao.class))

//@ComponentScan(basePackages = "org.koreait",
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
//                pattern = "org.koreait.member.dao.*Dao"))

//@ComponentScan(basePackages = "org.koreait",
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
//                pattern = "org.koreait..*Dao"))

//@ComponentScan(basePackages = "org.koreait",
//    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
//        pattern = "org.koreait.member\\..*Dao"))

@ComponentScan(basePackages = "org.koreait")
public class AppCtx2 {
    //@Bean
    public DateTimeFormatter  dateTimeFormatter(){
        return DateTimeFormatter.ofPattern("yy.MM.dd HH:mm");
    }
//    @Bean
//    @Qualifier("dtf2")
//    public DateTimeFormatter dateTimeFormatter2(){
//        return DateTimeFormatter.ofPattern("yyyy.MM.dd");
//    }
}