package floresta;
import floresta.Animal;

public class Tigre extends Animal {
    @Override
    public void emitirSom(String barulhoDeTigre) {
        System.out.println("RoarRrrrRrRrRrRr" + barulhoDeTigre);
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Tigre();
        animal.emitirSom();
    }
}
