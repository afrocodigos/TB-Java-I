package mobilidade;

public class Carro {
    //atributo
    private String modelo;
    private static int contadorDeCarro = 0;

    //métodos
    public Carro(String modelo) {
        this.modelo = modelo;
        contadorDeCarro++;
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

    public static int getContadorDeCarro() {
        return contadorDeCarro;
    }
}

//Carro mobi = new Carro()
//mobi.parar() - convencional


//Carro.getContadorDeCarro() - chamando um método estático

// Carro honda = new Carro()
// honda.acelerar()