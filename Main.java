public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");
        Gato gato = new Gato("Mimi", "Siamês");

        cachorro.caminha();
        cachorro.late();

        gato.caminha();
        gato.mia();
    }
}
