package br.com.alura;

import java.util.Set;

public class TestaSetDeAlunoComCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a5 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a5);

       Set<Aluno> alunos = javaColecoes.getAlunos();
       System.out.println(alunos);
       System.out.println(javaColecoes.estaMatriculado(a5)); // a5 esta matriculado por causa do javaColecoes.matricula(a5);
       
       Aluno mauricioa5 = new Aluno("Mauricio Aniche", 17645);
       System.out.println(javaColecoes.estaMatriculado(mauricioa5)); // por mais que tenha os mesmos dados, nao sao iguais

       
    }
}
