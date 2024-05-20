package Abstract.example11;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

        System.out.println();

        System.out.println("Hawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
