package border.cake.maratonajava.javacore.Npolimorfismo.servico;

import border.cake.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void Salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
