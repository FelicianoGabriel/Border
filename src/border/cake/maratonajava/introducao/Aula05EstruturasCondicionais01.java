package border.cake.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        //!

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");

        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");

        }
        boolean a = false;
        if (a == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");

        }

        System.out.println("Saida do IF");
    }
}