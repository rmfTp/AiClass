package exam06;

public interface Buyer {
    void buy();
    default void order(){
        System.out.println("buyer - 주문하기");
    }
    private void privateMethode(){
        System.out.println("private");
    }
    static void staticMethode(){//전역(public 생략가능)
        System.out.println("static");
    }
}
