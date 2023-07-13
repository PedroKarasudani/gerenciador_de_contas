package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaListaDeCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes2 = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes2.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes2.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes2.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulas = javaColecoes2.getAulas();
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);
        
    }
    

}
