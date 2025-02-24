package border.cake.maratonajava.javacore.Gassociacao.test;

import border.cake.maratonajava.javacore.Gassociacao.dominio.*;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua do Nunca");
        Aluno aluno = new Aluno("Peter Pan", 16);
        Professor professor = new Professor("Garga mel", "Magia");
        Aluno[] açunosDoSeminario = {aluno};

        Seminario seminario = new Seminario("Em busca da pedra filosofal", açunosDoSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);

        professor.imprime();

    }
}
