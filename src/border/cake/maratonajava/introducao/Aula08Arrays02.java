package border.cake.maratonajava.introducao;

public class Aula08Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, double, long e float  0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Darkness";
        nomes[1] = "Megumin";
        nomes[2] = "Aqua";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            nomes = new String[5];
        }
    }
}
