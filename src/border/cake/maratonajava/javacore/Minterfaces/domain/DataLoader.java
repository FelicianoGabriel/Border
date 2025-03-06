package border.cake.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissão");
    }

    public static void retrieveMaxSize() {
        System.out.println("Dentro do retrieveMaxSize na interface " + MAX_DATA_SIZE);
    }

}
