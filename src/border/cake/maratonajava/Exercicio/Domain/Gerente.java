public class Gerente extends Funcionario {
    private final double BONUS = 0.2;

    @Override
    public void calcularPagamento() {
            this.salario += this.salario * BONUS;
    }

    public Gerente (String nome, double salario) {
        super(nome, salario);
    }
}
