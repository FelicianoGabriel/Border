package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

public class ObterMedia {
    public void imprime(Funcionarios funcionarios){
        double media = funcionarios.salaries[0] + funcionarios.salaries[1] + funcionarios.salaries[2];
        System.out.println(media);
    }
}
