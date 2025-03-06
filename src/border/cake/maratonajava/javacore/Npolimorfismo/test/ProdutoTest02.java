package border.cake.maratonajava.javacore.Npolimorfismo.test;

import border.cake.maratonajava.javacore.Npolimorfismo.domain.Computador;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Produto;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import border.cake.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 5000);

        Tomate tomate = new Tomate("American", 12);
        tomate.setDataValidade("28/06/2008");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
