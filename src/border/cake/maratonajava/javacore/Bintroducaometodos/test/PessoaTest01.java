package border.cake.maratonajava.javacore.Bintroducaometodos.test;

import border.cake.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 extends Object {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.name = "Yamato";
        pessoa.setName("Yamato");
        pessoa.setAge(28);
        pessoa.imprime();
//        System.out.println(pessoa.getName());
//        System.out.println(pessoa.getAge());
    }
}
