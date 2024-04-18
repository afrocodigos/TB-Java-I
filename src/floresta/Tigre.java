package floresta;
import floresta.Animal;

public class Tigre extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("RoarRrrrRrRrRrRr");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Tigre();
        animal.emitirSom();
    }
}
