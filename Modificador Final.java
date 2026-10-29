package fina;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 21 - Modificador final (variavel, metodo e classe)
 */
 
// ---------- Exemplo 1: variável final ----------
class ExemploVariavel {
    void executar() {
        // Variável final: recebe o valor uma vez e não pode mais mudar
        final int MAXIMO = 100;
        System.out.println("Exemplo 1 - variavel final: MAXIMO = " + MAXIMO);
 
        // Descomente para ver o erro:
         //MAXIMO = 200;   // ERRO: cannot assign a value to final variable MAXIMO
    }
}
 
// ---------- Exemplo 2: método final ----------
class Mae {
    // Método final: as classes filhas NÃO podem sobrescrevê-lo
    final void dizerOla() {
        System.out.println("Ola, eu sou o metodo final da classe Mae.");
    }
}
 
class Filha extends Mae {
    // Descomente para ver o erro:
    // @Override
    // void dizerOla() { }   // ERRO: overridden method is final
}
 
// ---------- Exemplo 3: classe final ----------
// Classe final: não pode ser herdada
final class ClasseFinal {
    void mostrar() {
        System.out.println("Sou uma classe final: ninguem pode herdar de mim.");
    }
}
 
// Descomente para ver o erro:
// class Tentativa extends ClasseFinal { }   // ERRO: cannot inherit from final ClasseFinal
 
public class Main {
    public static void main(String[] args) {
        // Exemplo 1
        ExemploVariavel ex1 = new ExemploVariavel();
        ex1.executar();
 
        // Exemplo 2: a Filha usa o método herdado, sem alterá-lo
        Filha filha = new Filha();
        System.out.print("Exemplo 2 - metodo final: ");
        filha.dizerOla();
 
        // Exemplo 3
        ClasseFinal cf = new ClasseFinal();
        System.out.print("Exemplo 3 - classe final: ");
        cf.mostrar();
    }
}

