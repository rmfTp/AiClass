package exam02;

public class ex02 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Human(),
                new Tiger(),
                new Bird()
        };
        for (Animal animal: animals) {
            animal.move();
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.reading();
            }else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }else if (animal instanceof Bird bird) {
                bird.sing();
            }
        }
    }
}
