package org.koreait.global.configs;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import javax.sql.DataSource;

@Configuration
@MapperScan("org.koreait")
@EnableJdbcRepositories("org.koreait")
public class MyBatisConfig {
    @Autowired
    private DataSource dataSource;

    @Bean//스프링과 연동
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();//bean에 담기
        factoryBean.setDataSource(dataSource);//bean에 데이터 담기
        return factoryBean.getObject();//세션 객체 꺼내기
    }
}
