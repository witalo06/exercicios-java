package funcionario;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 10 - Construtores
 */
class Funcionario {
    String nome;
    String cargo;
    double salario;
    // Construtor sem parâmetros: define valores padrão
    Funcionario() {
        System.out.println("Construtor sem parametros executado.");
        nome = "Nao informado";
        cargo = "Nao informado";
        salario = 0;
    }
    // Construtor com parâmetros: recebe os valores na criação do objeto
    Funcionario(String nome, String cargo, double salario) {
        System.out.println("Construtor com parametros executado.");
        this.nome = nome;     // "this" diferencia o atributo do parâmetro
        this.cargo = cargo;
        this.salario = salario;
    }
    void exibir() {
        System.out.println("Nome: " + nome + " | Cargo: " + cargo + " | Salario: " + salario);
    }
}
public class Main {
    public static void main(String[] args) {
        // O construtor roda automaticamente no momento do "new"
        Funcionario f1 = new Funcionario();
        f1.exibir();
        Funcionario f2 = new Funcionario("Paula", "Analista", 4500.00);
        f2.exibir();
    }
}

