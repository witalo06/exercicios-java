package instancia;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 17 - Variaveis de Instancia
 */
class Pessoa {
    // Variáveis de instância: cada objeto Pessoa terá a sua própria cópia
    String nome;
    int idade;
}
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 20;
 
        Pessoa p2 = new Pessoa();
        p2.nome = "Bruno";
        p2.idade = 35;
 
        Pessoa p3 = new Pessoa();
        p3.nome = "Carla";
        p3.idade = 28;
 
        System.out.println("Pessoa 1: " + p1.nome + ", " + p1.idade + " anos");
        System.out.println("Pessoa 2: " + p2.nome + ", " + p2.idade + " anos");
        System.out.println("Pessoa 3: " + p3.nome + ", " + p3.idade + " anos");
 
        // Alterar um objeto não afeta os outros
        p1.idade = 21;
        System.out.println("Depois de mudar a idade da Ana:");
        System.out.println("Ana: " + p1.idade + " | Bruno: " + p2.idade
                + " | Carla: " + p3.idade);
    }
}

