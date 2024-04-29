public class DesafioBibliotecaSistema {
    public static void main(String[] args) {
        DesafioBibliotecaFuncionario funcionario = new DesafioBibliotecaFuncionario("Carlos", 123);
        DesafioBibliotecaLivro livro1 = funcionario.cadastrarLivro("Dom Casmurro", "Machado de Assis", 1899);
        DesafioBibliotecaLivro livro2 = funcionario.cadastrarLivro("O Cortiço", "Aluísio Azevedo", 1890);

        DesafioBibliotecaLeitor leitor = funcionario.cadastrarLeitor("Ana", 456);

        funcionario.emprestarLivro(livro1, leitor);

        System.out.println("Livros emprestados por Ana:");
        for (String info : leitor.obterLivrosEmprestados()) {
            System.out.println(info);
        }

        funcionario.devolverLivro(livro1, leitor);

        System.out.println("Livros emprestados após a devolução:");
        for (String info : leitor.obterLivrosEmprestados()) {
            System.out.println(info);
        }
    }
}