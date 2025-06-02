package exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringJUnitConfig(AppCtx.class)
public class Ex02 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("회원정보 추가")
    void test1() {
        String sql = "INSERT INTO MEMBER (email,password,name,mobile)" +
                "VALUES (?,?,?,?)";
        int affectedRows = jdbcTemplate.update(sql, "user01@test.org", "1234", "사용자01", "01011101111");
        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("회원 목록 조회")
    void test2() {
        String sql = "SELECT * FROM MEMBER WHERE email LIKE ?";
        List<Member> items = jdbcTemplate.query(sql,  this::mapper, "%user%");
        items.forEach(System.out::println);
    }

    @Test
    @DisplayName("회원 1명 조회")
    void test3() {
        String sql = "SELECT * FROM MEMBER WHERE email = ?";
        Member item = jdbcTemplate.queryForObject(sql, this::mapper, "user01@test.org");// 결과값이 1개가 아니면 예외
        System.out.println(item);
    }

    @Test
    @DisplayName("회원 1명의 이름 조회")
    void test4() {
        String sql = "SELECT name FROM MEMBER WHERE email = ?";
        String name = jdbcTemplate.queryForObject(sql, String.class, "user01@test.org");// 결과값이 1개가 아니면 예외
        System.out.println(name);
    }

    @Test
    @DisplayName("총 회원 수 조회")
    void test5() {
        long total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MEMBER", long.class);
        System.out.println(total);
    }

    @Test
    @DisplayName("회원이 추가되면 회원번호(증감) 가져오기")
    void test6() {
        String sql = "INSERT INTO MEMBER (email, password, name, mobile) VALUES (?,?,?,?)";
        KeyHolder ketHolder = new GeneratedKeyHolder();
        int affectedRows = jdbcTemplate.update(c -> {
            PreparedStatement pstmt = c.prepareStatement(sql, new String[] {"seq"});
            pstmt.setString(1,"user99@test.org");
            pstmt.setString(2,"1234");
            pstmt.setString(3,"사용자99");
            pstmt.setString(4,"01010001000");
            return pstmt;
            }, ketHolder
        );
        Number key = ketHolder.getKey();
        long seq = key.longValue();
        System.out.printf("회원번호: %d%n",seq);
    }

    private Member mapper(ResultSet rs, int i) throws SQLException{
        Member member = new Member();
        member.setSeq(rs.getLong("seq"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("password"));
        member.setName(rs.getString("name"));
        member.setMobile(rs.getString("mobile"));
        member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

        return member;
    }
}
