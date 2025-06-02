package exam02;

public class ex01 {
    public static void main(String[] args) {
        Animal human = new Human();
        human.move();

        Animal bird = new Bird();
        bird.move();

        Animal tiger = new Tiger();
        tiger.move();
        Animal[] animals = new Animal[3];
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;
    }
}
