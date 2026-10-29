package objt;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 11 - Destrutores (Garbage Collector)
 */
import java.lang.ref.WeakReference;
 
class Objeto {
    String nome;
    byte[] dados = new byte[1024 * 1024];   // ocupa cerca de 1 MB na memória
 
    Objeto(String nome) {
        this.nome = nome;
        System.out.println("Objeto " + nome + " criado.");
    }
}
 
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Criamos um objeto e uma referência para observar se ele ainda existe
        Objeto obj = new Objeto("A");
        WeakReference<Objeto> observador = new WeakReference<>(obj);
 
        System.out.println("Antes: o objeto ainda existe? " + (observador.get() != null));
 
        // Removemos a única referência forte: o objeto fica sem uso (elegível para coleta)
        obj = null;
 
        // Sugerimos ao Java rodar o Garbage Collector
        System.gc();
        Thread.sleep(500);   // pequena espera para o coletor trabalhar
 
        System.out.println("Depois: o objeto ainda existe? " + (observador.get() != null));
        System.out.println("Nao existe destrutor: o proprio Java liberou a memoria.");
    }
}

