package Abstract.example4;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        System.out.println("Lion:");
        lion.eat();
        lion.sleep();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sleep();

    }
}
