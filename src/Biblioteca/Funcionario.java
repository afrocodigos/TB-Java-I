Class Funcionario {
    private List<Livro> acervoLivros;
    private List<Usuario> usuariosCadastrados;

    public Funcionario() {
        this.acervoLivros = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervoLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        acervoLivros.remove(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuariosCadastrados.add(usuario);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (acervoLivros.contains(livro) && livro.getEstado().equals("disponível")) {
            livro.setEstado("emprestado");
            usuario.getLivrosEmprestados().add(livro);
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            usuario.getLivrosEmprestados().remove(livro);
            livro.setEstado("disponível");
        }
    }
}