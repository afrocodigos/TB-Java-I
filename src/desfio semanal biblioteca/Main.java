public class Main {

    public static void main(String[] args) {
     
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Disponível");
        Funcionario funcionario1 = new Funcionario("João Silva", 123);
        Usuario usuario1 = new Usuario("Maria Oliveira", 456);

       
        funcionario1.cadastrarUsuario("Pedro Souza", 789);

        
        funcionario1.consultarUsuario(456);
    }
}