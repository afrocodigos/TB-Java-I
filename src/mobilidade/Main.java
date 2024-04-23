package mobilidade;
import mobilidade.Carro;

public class Main {
    public static void main(String[] args) {
        Carro honda = new Carro("Honda");
        Fiat palio = new Fiat("Fiat", "hatch compacto");
        palio.parar();
    }
}
