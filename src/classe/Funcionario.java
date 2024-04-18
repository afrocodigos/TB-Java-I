package classe;
import java.util.Date;

//modificador de acesso - class - NomeClasse

public class Funcionario {
    //atributos/propriedades
    public String nome;
    public Date dataDeNascimento;
    public String endereco;
    public String departamento;
    public double salario;

    // métodos - construtor e normais
    public Funcionario(String nome, Date dataDeNascimento, String endereco, String departamento, double salario) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.departamento = departamento;
        this.salario = salario;
    }

    //modificador de acesso - tipo de dado que ele vai retorna(int, double, String) nomeDometodo

    public void imprimeDados() {
        System.out.println("Nome :" + nome);
        System.out.println("Data de Nascimento :" + dataDeNascimento);
        System.out.println("Endereço : " + endereco);
        
    }



}
