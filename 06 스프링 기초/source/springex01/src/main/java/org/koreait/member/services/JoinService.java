
package org.koreait.member.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.member.RequestJoin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.validators.JoinValidator;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor//생성자 매개변수 모두 초기화하며 추가
@RequiredArgsConstructor
public class JoinService {
    private JoinValidator validator;
    @NonNull
    private MemberDao memberDao;
//    @Autowired
//    public void setValidator(JoinValidator validator) {
//        this.validator = validator;
//    }
//
//    @Autowired
//    public void setMemberDao(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }

    public void process(RequestJoin form) {
        validator.validate(form); // 유효성 검사

        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setName(form.getName());
        member.setPassword(form.getPassword());

        memberDao.register(member); // 회원을 데이터베이스에 추가
    }
}
