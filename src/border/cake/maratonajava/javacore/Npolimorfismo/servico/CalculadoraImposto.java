package border.cake.maratonajava.javacore.Npolimorfismo.servico;

import border.cake.maratonajava.javacore.Npolimorfismo.domain.Computador;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Produto;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " +produto.getNome());
        System.out.println("Preço " +produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        // castong

        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate)produto).getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
