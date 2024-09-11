public class Loja {
    Livro[] livros;

    public Loja(Livro[] book){
        this.livros = book;
    }

    public void listarLivros(){
        System.out.println("Livros da loja: \n");
        for(Livro book:livros){
            System.out.println(book);
        }
    }

    public void calcTotal(){
        double soma = 0;
        for(Livro book:livros){
            soma += book.preco;
        }

        System.out.println(soma);
    }
}
