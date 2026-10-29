package biblio;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 13 - Orientacao a Objetos de Forma Abstrata
 */
 
// Situação do mundo real: uma BIBLIOTECA que empresta livros.
class Livro {
    String titulo;
    String autor;
    boolean disponivel = true;   // todo livro começa disponível
 // Objeto: Livro
    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
 // Comando da Ação
    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado.");
        } else {
            System.out.println("Livro \"" + titulo + "\" ja esta emprestado.");
        }
    }
 
    void devolver() {
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido.");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");
 
        livro.emprestar();
        livro.emprestar();   // tentativa de emprestar de novo
        livro.devolver();
        livro.emprestar();
    }
}
