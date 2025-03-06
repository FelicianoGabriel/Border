package border.cake.maratonajava.javacore.Npolimorfismo.test;

import border.cake.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import border.cake.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.Salvar();
    }
}
