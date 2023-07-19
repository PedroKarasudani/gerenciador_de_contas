package br.com.alura;

import java.util.List;

public class TestaListaDeCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes em java "
        ,"Paulo");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        //Agora dessa forma abaixo lanca exception, por causa do Colletions adicionado no return
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        //System.out.println(aulas);

        Aula aula1 = new Aula("Montando sistemas automatizados", 30);

        javaColecoes.adiciona(new Aula("Montando sistemas automatizados", 30));
        System.out.println(aulas);

        System.out.println(javaColecoes.aulaCadastrada(aula1));
    }
}
