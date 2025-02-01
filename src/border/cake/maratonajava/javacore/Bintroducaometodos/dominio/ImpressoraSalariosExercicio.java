package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraSalariosExercicio {
    public void imprime(FuncionariosExercicio funcionarios)
    {
        System.out.println(funcionarios.name);
        System.out.println(funcionarios.age);
        // tudo abaixo é "desnecessario"
        System.out.println(funcionarios.salaries[0]);
        System.out.println(funcionarios.salaries[1]);
        System.out.println(funcionarios.salaries[2]);
        System.out.println(funcionarios.obterMedia);
    }
}
