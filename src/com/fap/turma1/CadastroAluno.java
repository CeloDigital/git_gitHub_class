package com.fap.turma1;

public class CadastroAluno {

    String nome,email;

    int idade;

    void listInfoAlunos() {
        //METODO QUE GUARDA AS INFORMAÇÕES DOS ALUNOS
        System.out.println(
                "Nome do aluno: " + nome
                + "\n" + "Email do aluno: " + email
                + "\n" + "Idade do aluno: " + idade
        );
    }
}
