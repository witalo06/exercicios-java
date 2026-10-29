package stati;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 20 - Modificador static
 */
 
class Matematica {
    // Métodos estáticos: pertencem à classe, não precisam de objeto
    static int somar(int a, int b) {
        return a + b;
    }
 
    static int multiplicar(int a, int b) {
        return a * b;
    }
 
    // Método de instância (para comparação): só funciona com um objeto criado
    int subtrair(int a, int b) {
        return a - b;
    }
}
 
public class Main {
    public static void main(String[] args) {
        // Chamando os métodos estáticos diretamente pelo nome da classe, sem "new"
        System.out.println("somar(6, 4) = " + Matematica.somar(6, 4));
        System.out.println("multiplicar(6, 4) = " + Matematica.multiplicar(6, 4));
 
        // O método de instância precisa de um objeto
        Matematica m = new Matematica();
        System.out.println("subtrair(6, 4) = " + m.subtrair(6, 4));
    }
}

