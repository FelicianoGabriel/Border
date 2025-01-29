package border.cake.maratonajava.javacore.Bintroducaometodos.test;

import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Shiraroshi";
        estudante01.idade = 18;
        estudante01.sexo = 'F';

        estudante02.nome = "ZeroTwo";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();;
        estudante02.imprime();;
    }
}
