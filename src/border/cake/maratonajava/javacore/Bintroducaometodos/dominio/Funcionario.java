package border.cake.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

   // public String getNome() {
   //     return nome;
   // }

  //  public void setNome(String nome) {
    //    this.nome = nome;
  //  }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
    // pode ser removido o acesso não usando o set, o get funciona ainda.
    // todos set tem this porque eles tem a variável no set, já os get não, por isso usam  return.
}