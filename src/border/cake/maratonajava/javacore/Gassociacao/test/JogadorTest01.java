package border.cake.maratonajava.javacore.Gassociacao.test;

import border.cake.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Cr7");
    Jogador jogador2 = new Jogador("Ney");
    Jogador jogador3 = new Jogador("Messi");
    Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
