package exam01;

public class loginService {
    public void process(String userId, String userPw) throws userIdException,userPwException {
        if (!userId.equals("user01")){
            throw new userIdException("아이디가 일치하지 않습니다.");
        }
        if (!userPw.equals("user01")){
            throw new userPwException("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("로그인됨");
    }
}
