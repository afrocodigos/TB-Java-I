package banco;
// exemplo trabalhando com encapsulamento
public class ContaBancaria {
    private double saldo = 0;

    public void depositar(double valorDoDeposito) {
        saldo += valorDoDeposito;
    }

    public void sacar(double valorDeSaque) {
        if (valorDeSaque <= saldo) {
            saldo -= valorDeSaque;
        } else { 
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
