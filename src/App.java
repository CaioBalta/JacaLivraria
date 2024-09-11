import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Nome do Livro: ");
        String nome = scan.nextLine();
        System.out.println("Nome do Autor: ");
        String autor = scan.nextLine();
        System.out.println("Digite o valor: ");
        double preco = scan.nextDouble();
        System.out.println("\n");

        Livro livro = new Livro(nome, autor, preco);
        Livro livro2 = new Livro("Senhor dos Aneis", "J.R.Tolkien", 88.52);
        //System.out.println(livro);
        //System.out.println(livro2);

        Livro[] book = {livro, livro2};
        Loja loja = new Loja(book);
        loja.listarLivros();
        loja.calcTotal();
    }
}