package Abstract.example8;

public class Main {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();

        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println();

        System.out.println("Lazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
