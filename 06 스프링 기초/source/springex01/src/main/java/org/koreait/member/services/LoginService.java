
package org.koreait.member.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.Member;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LoginService {
    //@Autowired\
    @NonNull
    private LoginValidator validator;
    //@Autowired
    private final Optional<MemberDao> opt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd");

    @Autowired(required = false)
    //@Qualifier("dtf2")
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void process(RequestLogin form) {
        validator.validate(form);
        MemberDao memberDao = opt.orElse(null);
        if (memberDao == null) {
            return;
        }

        Member member = memberDao.get(form.getEmail());
        if (member != null && formatter != null) {
            String dateStr = formatter.format(member.getRegDt());
            member.setRegDtStr(dateStr);
        }

        System.out.println(member);
        System.out.println("로그인 완료");
    }
}
