package exam06;

public interface Seller {
    void sell();
    default void order(){
        System.out.println("Seller - 주문하기");
    }
    private void privateMethode(){
        System.out.println("private");
    }
}
