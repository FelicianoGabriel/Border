package border.cake.maratonajava.javacore.Jmodificaforfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNpme() {
        return nome;
    }

    public void setNome(String npme) {
        this.nome = npme;
    }
}
