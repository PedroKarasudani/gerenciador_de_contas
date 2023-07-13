package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaDeCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes2 = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes2.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes2.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes2.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulasImutaveis = javaColecoes2.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasCopia = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasCopia);
        System.out.println(aulasCopia);
        
        System.out.println(javaColecoes2.getTempoTotal());
        System.out.println(javaColecoes2);
    }
    

}
