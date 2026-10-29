package poli;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: [SEU RA]
 * Atividade 09 - Polimorfismo
 */
 
// Superclasse com um comportamento genérico
class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}
class Cachorro extends Animal {
    @Override   // sobrescreve o método da superclasse
    public void emitirSom() {
        System.out.println("Cachorro: Au au!");
    }
}
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Todas as variáveis são do tipo Animal, mas os objetos são de tipos diferentes
        Animal a1 = new Animal();
        Animal a2 = new Cachorro();
        Animal a3 = new Gato();
        // A mesma chamada emitirSom() produz resultados diferentes (polimorfismo)
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        // Também funciona em uma lista de Animal
        Animal[] animais = { new Cachorro(), new Gato(), new Cachorro() };
        for (Animal a : animais) {
            a.emitirSom();   // o Java escolhe o método certo em tempo de execução
        }
    }
}

