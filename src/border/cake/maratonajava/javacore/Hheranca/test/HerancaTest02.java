package border.cake.maratonajava.javacore.Hheranca.test;

import border.cake.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialzação estático da superclasse é executado quando a JVM carregar a superclasse pai
    // 1 - Bloco de inicialzação estático da subclasse é executado quando a JVM carregar a subclasse filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado em que aparece
    // 5 - Construtor é executado da superclasse

    // 7 - Alocado espaço em memória pro objeto da subclasse
    // 8 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 9 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 10 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maide");;
    }
}
