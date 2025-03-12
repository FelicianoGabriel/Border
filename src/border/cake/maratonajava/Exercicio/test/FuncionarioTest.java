public class FuncionarioTest {
    public static void main(String[] argss) {
        Funcionario funcionario1 = new Gerente("Desenvolvedor", 20000);
        Funcionario funcionario2 = new Estagiario("Junior", 1200);
        Funcionario funcionario3 = new Gerente("Negocio",30000);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularPagamento();
            funcionario.exibirDados();
        }

    }
}