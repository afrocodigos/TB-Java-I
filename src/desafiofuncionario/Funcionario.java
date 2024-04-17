package desafiofuncionario;

public class Funcionario {
    private String nome, cargo;    
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return this.nome + " é " + this.cargo + " e recebe " + this.salario;
    }
}
