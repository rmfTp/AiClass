package exam05;

public class JoinServer {
    private static JoinServer instance;

    private JoinServer(){}

    public void process(){
        System.out.println("회원가입처리");
    }
    public static JoinServer getInstance() {
        if(instance==null)instance = new JoinServer();
        return instance;
    }

}
