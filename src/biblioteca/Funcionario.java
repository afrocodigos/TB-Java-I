public class Funcionario {
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Usuario cadastrarUsuario(String nome, int id){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setId(id);
        System.out.println("Usuário cadastrado com sucesso");
        return usuario;
    }
    public void emprestarLivro(Usuario usuario, Livro livro){
        if(livro.getEstado() == 1){
            livro.setEstado(0);
            usuario.pegarEmprestado(livro);
            System.out.println("Livro emprestado com sucesso");
        }
        else{
            if(livro.getEstado() == 2){
                if(livro.getPreterido() == usuario.getId()){
                    livro.setEstado(0);
                    usuario.pegarEmprestado(livro);
                    System.out.println("Livro emprestado com sucesso");
                }
                else{
                    System.out.println("Livro reservado para outro usuário");
                }
            }
            else{
                System.out.println("O Livro já foi emprestado");
            }
        }
    }
    public void devolverLivro(Usuario usuario, Livro livro){
        if(livro.getEstado() == 0){
            livro.setEstado(1);
            usuario.devolver(livro);
        }
        else{
            System.out.println("Livro não está emprestado");
        }
    }
    public Livro cadastrarLivro(String titulo, String autor, int ano){
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAno(ano);
        livro.setEstado(1);
        System.out.println("Livro cadastrado com sucesso");
        return livro;
    }
    public void excluirLivro(Livro livro){
        livro = null;
    }
    public void reservarLivro(Livro livro, Usuario usuario){
        if(livro.getEstado() == 1){
            livro.setEstado(2);
            livro.setPreterido(usuario.getId());
            System.out.println("Livro reservado com sucesso");
        }
        else{
            System.out.println("Livro não disponível para reserva");
        }
    }
    
}
