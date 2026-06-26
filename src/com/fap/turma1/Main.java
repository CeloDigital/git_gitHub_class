package com.fap.turma1;

public class Main {

    public static void main(String[] args) {
        CadastroAluno aluno1 = new CadastroAluno();
        aluno1.nome = "Marcelo";
        aluno1.email = "marcelo@hotmail.com";
        aluno1.idade = 28;
        aluno1.mensalidade = 500;
        aluno1.desconto = 150;

        aluno1.systemMessage();
        System.out.println();
        aluno1.exibirCurso("Teste de Software");
        System.out.println();

        double valorFinal = aluno1.calcularValorFinal();
        System.out.println(valorFinal);


        double media = aluno1.calcularNotas(8, 7.3, 6);
        System.out.printf("Média: %.1f ", media);

        aluno1.verificarAprovacao(media);
    }

}
