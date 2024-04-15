public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private int estado; //0 para emprestado, 1 para disponível, 2 para reservado
    private int idPreterido;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }   
    public int getPreterido() {
        return idPreterido;
    }
    public void setPreterido(int idPreterido) {
        this.idPreterido = idPreterido;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Livro){
            Livro livro = (Livro) obj;
            if(this.titulo.equals(livro.getTitulo()) && this.autor.equals(livro.getAutor()) && this.ano == livro.getAno()){
                return true;
            }
        }
        return false;
    }
}
