package escola.empregado;

import escola.pessoa.Pessoa;

public class Empregado extends Pessoa {
    private String categoria;
    private String funcao;

    public Empregado(String nome, String endereco, String categoria, String funcao) {
        super(nome, endereco);
        this.categoria = categoria;
        this.funcao = funcao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void trabalhar() {
        System.out.println(getNome() + ": Vamo trabalhar meu povo");
    }

    public void baterCartao() {
        System.out.println(getNome() + ": Atenção meu povo,não esqueça de bater cartão");
    }

}
