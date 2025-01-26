package border.cake.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemoplo, 50
    public static void main(String[] args) {
        int count = 50;
        for (int i = 0; i <= count; i += 1) {
            if (i > 25) {
                break;
            }
            System.out.println("i = "+i);
        }
    }
}
