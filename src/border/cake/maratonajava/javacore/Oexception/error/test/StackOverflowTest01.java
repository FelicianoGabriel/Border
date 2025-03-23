public class StackOverflowTest01 {

    //Um erro é um erro na JVM, então não tem como recuperar dados, é algo que não temos controle, mas podemos prevenir.
    public static void main(String[] args) {

        recursividade();
        
    }
    public static void recursividade() {
        recursividade();
    }
}