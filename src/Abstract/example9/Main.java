package Abstract.example9;

public class Main {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        System.out.println("Glockenspiel:");
        glockenspiel.play();
        glockenspiel.tune();

        System.out.println();

        System.out.println("Violin:");
        violin.play();
        violin.tune();
    }
}
