package floresta;
import floresta.Animal;

public class Tigre extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Tigre fazendo barulho");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Tigre();
        animal.emitirSom();
    }
}
