public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public void calcularPagamento() {

    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }

    public Funcionario (String nome, double salario){
        this.nome  = nome;
        this.salario = salario;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}