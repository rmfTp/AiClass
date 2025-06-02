package exam06;

public class ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        Buyer buyer = order;
        buyer.buy();
        Seller seller = order;
        seller.sell();

        order.buy();
    }
}
