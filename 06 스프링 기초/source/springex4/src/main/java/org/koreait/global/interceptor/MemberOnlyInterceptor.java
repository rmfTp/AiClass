package org.koreait.global.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandler()");
        HttpSession session = request.getSession();
        if (session.getAttribute("loggedMember") != null)
            return true;
        response.sendRedirect(request.getContextPath()+"/member/login?redirectUrl=/survey/page1");
        return false;
    }
}
