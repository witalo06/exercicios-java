package abstrac;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 04 - Classe Abstrata
 */
// Classe abstrata: não pode ser instanciada, serve de base para outras classes
abstract class Animal {
    String nome;
    // Construtor da classe abstrata 
    Animal(String nome) {
        this.nome = nome;
    }
    // Método abstrato
    abstract void emitirSom();
    // Método comum: já vem pronto e é herdado pelas filhas
    void dormir() {
        System.out.println(nome + " esta dormindo.");
    }
}
// Cachorro herda de Animal (extends)
class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);   // chama o construtor de Animal
    }
    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }
}
// Gato também herda de Animal
class Gato extends Animal {
    Gato(String nome) {
        super(nome);
    }
    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Qualquer");  // ERRO: classe abstrata não pode ser instanciada
 
        Cachorro rex = new Cachorro("Rex");
        Gato mia = new Gato("Mia");
        rex.emitirSom();
        rex.dormir();     // método herdado de Animal
        mia.emitirSom();
        mia.dormir();
    }
}
