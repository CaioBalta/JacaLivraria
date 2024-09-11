public class Livro {
    //titulo, autor, preco
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "LIVRO: " + this.titulo + "\n" + 
        "PREÇO: " + this.preco + "\n" +
        "AUTOR: " + this.autor + "\n";
    }
}
