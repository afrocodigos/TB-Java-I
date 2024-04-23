
public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private int horasTrabalhadas;

    public Funcionario(String nome, int idade, double salario, String cargo, int horasTrabalhadas) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calcularSalario() {

    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Cargo: " + getCargo() + " Salário: " + getSalario();
    }

}
