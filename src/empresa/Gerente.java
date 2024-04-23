package empresa;

public class Gerente extends Funcionario{
    
    private double bonus = 0;

    public Gerente(String nome, String cpf, double salario, int idade) {
        super(nome, cpf, salario, idade);
    }

    @Override
    public double calcularSalario() {
        return (getSalario() + (getSalario() * bonus));
    }

    public void setBonus(double bonus) {
        if (bonus > 0.15){
            throw new IllegalArgumentException("O bonus não pode ser maior que 15% do salário");
        }
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return "Gerente [cpf=" + getCpf() + ", idade=" + getIdade() + ", nome=" + getNome() + ", salario=" + getSalario() + "]";
    }
}
