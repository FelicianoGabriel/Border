package border.cake.maratonajava.javacore.Npolimorfismo.test;

import border.cake.maratonajava.javacore.Npolimorfismo.domain.Computador;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import border.cake.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import border.cake.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung", 12000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        Televisao tv = new Televisao("Samsung 49\" ",20000);


        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
