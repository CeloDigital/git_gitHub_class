package com.fap.turma1;

public class Main {

    public static void main(String[] args) {
        CadastroAluno aluno1 = new CadastroAluno();
        aluno1.nome = "Marcelo";
        aluno1.email = "marcelo@hotmail.com";
        aluno1.idade = 28;

        CadastroAluno aluno2 = new CadastroAluno();
        aluno2.nome = "Marilia";
        aluno2.email = "Marilia@hotmail.com";
        aluno2.idade = 27;


        aluno1.listInfoAlunos();
        System.out.println();
        aluno2.listInfoAlunos();
    }

}
