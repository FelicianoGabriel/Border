package border.cake.maratonajava.javacore.Kenum.test;

import border.cake.maratonajava.javacore.Kenum.dominio.Cliente;
import border.cake.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import border.cake.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Megumi",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
