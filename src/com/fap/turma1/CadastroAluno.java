package com.fap.turma1;

public class CadastroAluno {
    String nome,email;
    int idade;
    double desconto;
    double mensalidade;

    void systemMessage() {

        System.out.println("Seja bem-vindo ao sistema");
        System.out.println(nome);
        System.out.println(email);
        System.out.println(idade);
    }

    void exibirCurso(String curso) {
        System.out.println("Curso: " + curso);
    }

    double calcularValorFinal() {
        return mensalidade - desconto;
    }

    double calcularNotas(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    void verificarAprovacao(double media) {
        if (media >= 7) {
            System.out.println("ALUNO PROVADO!");
        } else {
            System.out.println("ALUNO REPROVADO!");
        }
    }

}
