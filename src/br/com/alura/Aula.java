package br.com.alura;

public class Aula implements Comparable<Aula> {
     private String titulo;
     private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula [titulo=" + this.titulo + ", tempo=" + this.tempo + "minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }

  
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aula other = (Aula) obj;
        if (tempo != other.tempo)
            return false;
        return true;
    }

   
    
    
}
