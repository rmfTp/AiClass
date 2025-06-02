package exam02;

public final class Human extends Animal {
    public void move() {
        System.out.println("두발로 걷는다.");
    }

    protected final void reading() {
        System.out.println("책을읽는다");
    }
}
