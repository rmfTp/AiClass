package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringJUnitConfig(AppCtx.class)
public class Ex04 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        LocalDateTime sdate = LocalDateTime.now().minusWeeks(1L);
        LocalDateTime edate = LocalDateTime.now();

        //Pageable pageable = PageRequest.of(0,4);
        Pageable pageable = PageRequest.of(0,4, Sort.by(desc("regDt"),asc("email")));
        Page<Member> data = repository.findByRegDtBetween(sdate,edate,pageable);

        List<Member> items = data.getContent();
        long total = data.getTotalElements();
        int totalPage = data.getTotalPages();

        items.forEach(System.out::println);
        System.out.printf("total:%d,tatalPage:%d%n",total,totalPage);
    }
}
