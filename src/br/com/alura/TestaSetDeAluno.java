package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaSetDeAluno {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");
        

        boolean adicionou = alunos.add("Roberto");
        System.out.println("adiciciou Roberto??" + adicionou);
        boolean adicionou2 = alunos.add("Nico");
        System.out.println("adiciciou Nico??" + adicionou2);
        
        

        for (String aluno : alunos) {
            System.out.println(aluno);            
        }
        System.out.println(alunos.size());

    }
}
