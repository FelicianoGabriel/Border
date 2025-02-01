package border.cake.maratonajava.javacore.Bintroducaometodos.test;

import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.FuncionariosExercicio;
import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraSalariosExercicio;

public class FuncionariosExercicioTest {
    public static void main(String[] args) {
        FuncionariosExercicio funcionarios = new FuncionariosExercicio();

        ImpressoraSalariosExercicio impressora = new ImpressoraSalariosExercicio();
        // não precisava disso aqui
        funcionarios.name = "Yumeko";
        funcionarios.age = 16;
        funcionarios.obterMedia = funcionarios.salaries[0] + funcionarios.salaries[1] + funcionarios.salaries[2] / 3;
        /* Ao inves de funcionarios salarios receber a referencia da array ele poderia ser a array bem aqui
        funcionarios.salaries = new double[] {e os valores aqui dentro separado por virgulas};
         */
        impressora.imprime(funcionarios);
        // aqui poderia ter sido funcionario.imprimw();
        /*
        ao inves da gambiarra para imprimir poderia ser
        funcionarios.imprimeMediaSalarial();
         */
    }
}
