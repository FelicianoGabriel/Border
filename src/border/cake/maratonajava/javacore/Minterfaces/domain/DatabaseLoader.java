package border.cake.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    // Private -> default -> protected -> public ->

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados,,,");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de daods");
    }

    public static void retrieveMaxSize() {
        System.out.println("Dentro do retrieveMaxSize na classe DatabaseLoader " + MAX_DATA_SIZE);
    }

}
