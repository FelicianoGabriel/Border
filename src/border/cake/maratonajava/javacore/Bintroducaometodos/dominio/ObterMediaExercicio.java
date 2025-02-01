package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

public class ObterMediaExercicio {
    public void imprime(FuncionariosExercicio funcionarios) {
        double media = funcionarios.salaries[0] + funcionarios.salaries[1] + funcionarios.salaries[2];
        System.out.println(media);
        // não foi uma pessima ideia criar outra classe, nas considerando que somos iniciantes n foi tão bom
    }
}
