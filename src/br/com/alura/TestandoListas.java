package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecedo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String string : aulas) {
            System.out.println("Aula: " + string);            
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula e: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++){
            System.out.println("Aula " + (i+1) + ": " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aula: " + aula);
        });

        String aula4 = "A primeira roda"; 
        aulas.add(aula4);
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
