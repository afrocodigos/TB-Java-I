package desafio02;

public class Gerente extends Funcionario {
    protected Double vendas;
    protected Double comissao;

    public Gerente(String nome, int idade, double salarioBase, String departamento, double vendas, double comissao) {
        super(nome, idade, salarioBase, departamento);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario(){
        Double salarioTotal = this.salarioBase + (this.vendas * this.comissao);
        return salarioTotal;
    };

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

}