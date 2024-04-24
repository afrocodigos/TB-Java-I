package mobilidade;

public class Fiat extends Carro {
    
    private String tipo; 

    public Fiat (String modelo, String tipo) {
        super(modelo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void acelerar(){
        System.out.println("Acelerando meu fiat");
    }

    public void exibirModelo() {
        parar();
    }
}
