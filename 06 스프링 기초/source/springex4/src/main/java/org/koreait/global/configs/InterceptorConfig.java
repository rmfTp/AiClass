package org.koreait.global.configs;

import lombok.RequiredArgsConstructor;
import org.koreait.global.interceptor.CommonInterceptor;
import org.koreait.global.interceptor.MemberOnlyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    private final MemberOnlyInterceptor memberOnlyInterceptor;
    private final CommonInterceptor commonInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(memberOnlyInterceptor).addPathPatterns("/survey/**");
//      registry.addInterceptors(commonInterceptor).addPathPatterns("/**");
        registry.addInterceptor(commonInterceptor);
    }
}
