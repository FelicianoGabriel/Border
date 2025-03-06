package border.cake.maratonajava.javacore.Npolimorfismo.test;

import border.cake.maratonajava.javacore.Npolimorfismo.domain.Computador;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Produto;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("------------------------");

        Produto produto1 = new Tomate("American", 12);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
    }
}
