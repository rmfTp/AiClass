package exam01;

public class ex07 {
    public static void main(String[] args) {
        loginService service  = new loginService();
        try {
            service.process("user02","1234");
        } catch (userIdException|userPwException e){
            System.out.println(e.getMessage());
        }
    }
}
