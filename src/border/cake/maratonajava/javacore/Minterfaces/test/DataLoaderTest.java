package border.cake.maratonajava.javacore.Minterfaces.test;

import border.cake.maratonajava.javacore.Minterfaces.domain.DataLoader;
import border.cake.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import border.cake.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.load();

        databaseLoader.remove();
        fileLoader. remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxSize();
        DatabaseLoader.retrieveMaxSize();
    }
}
