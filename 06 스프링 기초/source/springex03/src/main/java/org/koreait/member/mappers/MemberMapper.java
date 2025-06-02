package org.koreait.member.mappers;

import org.koreait.member.entities.Member;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public interface MemberMapper {
    List<Member> getList();
}
