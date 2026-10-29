package pesquisa;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 01 - Objetos
 */

// Classe Aluno: é a estrutura que define como aluno será representado
class Aluno {
    // Atributos: características de cada aluno
    String nome;
    int idade;
    String curso;
 
    // Método que mostra os dados do aluno na tela
    void apresentar() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Curso: " + curso);
    }
}
public class Main {
    public static void main(String[] args) {
        // Primeiro objeto da classe Aluno com a palavra new
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.idade = 20;
        aluno1.curso = "TI";
 
        // Segundo objeto: é outro aluno que ocupa outro espaço na memória
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.idade = 22;
        aluno2.curso = "TI";
 
        // Cada objeto guarda seus próprios dados
        aluno1.apresentar();
        aluno2.apresentar();
 
        // Esse símbolo == compara se as duas variáveis apontam para o mesmo objeto
        System.out.println("aluno1 e aluno2 sao o mesmo objeto? " + (aluno1 == aluno2));
    }
}