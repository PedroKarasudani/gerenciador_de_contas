package br.com.alura;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome nao pode ser NULL");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object obj){
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    // @Override
    // public int hashCode(){
    //     return this.nome.charAt(0);
    // }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Aluno [Nome=" + nome + ", Matricula=" + numeroMatricula + "]";
    }

    

}
