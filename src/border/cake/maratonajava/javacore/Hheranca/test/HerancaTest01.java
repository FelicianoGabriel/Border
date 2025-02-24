package border.cake.maratonajava.javacore.Hheranca.test;

import border.cake.maratonajava.javacore.Hheranca.dominio.Endereco;
import border.cake.maratonajava.javacore.Hheranca.dominio.Funcionario;
import border.cake.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Hannah");
        pessoa.setCpf("111.111.111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lisley");
        funcionario.setCpf("222.222.222-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------------------------");
        funcionario.imprime();
    }
}
