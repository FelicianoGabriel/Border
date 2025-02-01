package border.cake.maratonajava.javacore.Csobrecargametodos.test;

import border.cake.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Konosuba", "TV", 72, "Comédia");
        anime.imprime();
    }
}
