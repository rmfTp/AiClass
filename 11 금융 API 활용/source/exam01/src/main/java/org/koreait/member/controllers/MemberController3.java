package org.koreait.member.controllers;

import org.koreait.member.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/member3")
public class MemberController3 {
    @GetMapping
    public Member info(){
        return Member.builder().seq(1L).name("사용자01").email("user01@test.org").build();
    }
}