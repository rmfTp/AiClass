package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Member;
import org.koreait.member.entities.MemberProfile;
import org.koreait.member.repositories.MemberProfileRepository;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles({"default","test"})
@SpringBootTest
@Transactional
public class Ex08 {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberProfileRepository profileRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        MemberProfile profile = new MemberProfile();
        profile.setProfileInfo("프로필 정보");
        profile.setProfileImage("프로필 이미지");
        profileRepository.saveAndFlush(profile);

        Member member = new Member();
        member.setName("사용자01");
        member.setEmail("user01@test.org");
        member.setPassword("11111111");
        member.setProfile(profile);
        member.setAuthority(Authority.MEMBER);
        memberRepository.saveAndFlush(member);

        em.clear();
    }

    @Test
    void test1(){
        Member member = memberRepository.findById(1L).orElse(null);
        MemberProfile profile = member.getProfile();
        System.out.println(profile);
    }

    @Test
    void test2() {
        MemberProfile profile = profileRepository.findById(1L).orElse(null);
        Member member = profile.getMember();
        System.out.println(member);
    }
}