package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a5 = new Aluno("Mauricio Aniche", 17645);
        Aluno a3 = new Aluno("Joao Neto", 5617); //mesmo numero de matricula que a2

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a5);
        javaColecoes.matricula(a3);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem e o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatricula(5617);
        System.out.println("Aluno: " + aluno);        
    }
}
