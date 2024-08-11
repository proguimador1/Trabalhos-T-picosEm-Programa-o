public class Livro {

    private String titulo;
    private String nomeAutor;
    private int codigo;

    Livro(String titulo, String autor){

        this.titulo = titulo;

        nomeAutor = autor;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){

        return "Título: " + this.titulo + "\nAutor: " + this.nomeAutor + "\nCódigo: " + this.codigo;

    }
    
}
