package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class ImpressoraSalarios {
    public void imprime(Funcionarios funcionarios)
    {
        System.out.println(funcionarios.name);
        System.out.println(funcionarios.age);
        System.out.println(funcionarios.salaries[0]);
        System.out.println(funcionarios.salaries[1]);
        System.out.println(funcionarios.salaries[2]);
        System.out.println(funcionarios.obterMedia);
    }
}
