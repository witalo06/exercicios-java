package pessoa;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 05 - Heranca
 */
// Superclasse: guarda o que é comum a toda pessoa
class Pessoa {
    String nome;
    int idade;
 
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    void apresentar() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}
// Professor herda de Pessoa: já tem nome, idade e apresentar()
class Professor extends Pessoa {
    String disciplina;   // atributo só do professor
    Professor(String nome, int idade, String disciplina) {
        super(nome, idade);        // reaproveita o construtor de Pessoa
        this.disciplina = disciplina;
    }
    void lecionar() {
        System.out.println(nome + " esta lecionando " + disciplina);
    }
}
// Aluno também herda de Pessoa
class Aluno extends Pessoa {
    String curso;        // atributo só do aluno
    Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }
    void estudar() {
        System.out.println(nome + " esta estudando " + curso);
    }
}
public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", 45, "Programacao Java");
        Aluno aluno = new Aluno("Marina", 21, "TI");
        prof.apresentar();   // método herdado de Pessoa
        prof.lecionar();     // método do próprio Professor
        aluno.apresentar();  // método herdado de Pessoa
        aluno.estudar();     // método do próprio Aluno
    }
}

