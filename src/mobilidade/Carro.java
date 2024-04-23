package mobilidade;

public class Carro {
    //atributo
    private String modelo;

    //métodos
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo () {
        return modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando, vrum vrum vrum...");
    }

    protected void parar() {
        System.out.println("Imnagine um barulho de freio bem alto pique caminhão na br");
    }
}

// Carro honda = new Carro()
// honda.acelerar()