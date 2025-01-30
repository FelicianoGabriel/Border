package border.cake.maratonajava.javacore.Bintroducaometodos.test;

import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;
import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraSalarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();

        ImpressoraSalarios impressora = new ImpressoraSalarios();

        funcionarios.name = "Yumeko";
        funcionarios.age = 16;
        funcionarios.obterMedia = funcionarios.salaries[0] + funcionarios.salaries[1] + funcionarios.salaries[2]/3;
        impressora.imprime(funcionarios);
    }
}
