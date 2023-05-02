
package Loja_de_livros_CDs_DVDs;

public class Loja {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 29.90, "Machado de Assis");
        Livro livro2 = new Livro("O Senhor dos Anéis", 59.90, "J.R.R. Tolkien");
        CD cd1 = new CD("Thriller", 39.90, 9);
        CD cd2 = new CD("Nevermind", 29.90, 12);
        DVD dvd1 = new DVD("Pulp Fiction", 24.90, 154);
        
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(dvd1);
    }
}
