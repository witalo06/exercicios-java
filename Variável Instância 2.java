package instac;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 22 - Variaveis de Instancia (Aluno)
 */
 
class Aluno {
    // Variáveis de instância: declaradas dentro da classe, fora de qualquer método
    String nome;
    double nota;
}
 
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.nota = 8.5;
 
        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.nota = 6.0;
 
        Aluno a3 = new Aluno();
        a3.nome = "Carla";
        a3.nota = 9.5;
 
        System.out.println("Notas iniciais:");
        System.out.println(a1.nome + ": " + a1.nota);
        System.out.println(a2.nome + ": " + a2.nota);
        System.out.println(a3.nome + ": " + a3.nota);
 
        // Alterando só a nota do Bruno
        a2.nota = 7.5;
 
        System.out.println("Depois de alterar a nota do Bruno:");
        System.out.println(a1.nome + ": " + a1.nota);
        System.out.println(a2.nome + ": " + a2.nota);
        System.out.println(a3.nome + ": " + a3.nota);
    }
}
