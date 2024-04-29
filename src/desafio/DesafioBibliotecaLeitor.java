import java.util.ArrayList;
import java.util.List;

public class DesafioBibliotecaLeitor {
    String nome;
    int identificacao;
    List<DesafioBibliotecaLivro> livrosEmprestados;

    public DesafioBibliotecaLeitor(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(DesafioBibliotecaLivro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(DesafioBibliotecaLivro livro) {
        livrosEmprestados.remove(livro);
    }

    public List<String> obterLivrosEmprestados() {
        List<String> informacoes = new ArrayList<>();
        for (DesafioBibliotecaLivro livro : livrosEmprestados) {
            informacoes.add(livro.obterInformacoes());
        }
        return informacoes;
    }
}