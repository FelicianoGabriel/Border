package border.cake.maratonajava.javacore.Npolimorfismo.servico;

import border.cake.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void Salvar() {
        System.out.println("Salvando em um Arquivp");
    }
}
