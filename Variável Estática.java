package estatico;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 16 - Variaveis Estaticas
 */
class Funcionario {
    // Variável estática: pertence à CLASSE e é compartilhada por todos os objetos
    static int quantidadeFuncionarios = 0;
 
    String nome;   // variável de instância: cada funcionário tem o seu
 
    Funcionario(String nome) {
        this.nome = nome;
        quantidadeFuncionarios++;   // a cada objeto criado, soma 1 ao contador
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Antes de criar: " + Funcionario.quantidadeFuncionarios);
 
        Funcionario f1 = new Funcionario("Ana");
        System.out.println("Depois do 1o funcionario: " + Funcionario.quantidadeFuncionarios);
 
        Funcionario f2 = new Funcionario("Bruno");
        Funcionario f3 = new Funcionario("Carla");
 
        // Acessamos pelo nome da classe, sem precisar de um objeto
        System.out.println("Total de funcionarios: " + Funcionario.quantidadeFuncionarios);
    }
}

