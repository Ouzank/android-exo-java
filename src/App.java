public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pikachu pika = new Pikachu();
        Dracaufeu dracau = new Dracaufeu();
        Voltali volt = new Voltali();

        pika.pokemon();
        pika.talent();
        pika.canEvolve();

        volt.pokemon();
        volt.talent();
        volt.canEvolve();

        dracau.pokemon();
        dracau.talent();
        dracau.canEvolve();

    }
}
