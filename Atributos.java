package produto;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 02 - Atributos
 */
// Classe Produto com quatro atributos
class Produto {
    int codigo;        // identificador do produto
    String nome;       // nome do produto
    double preco;      // preço unitário
    int quantidade;    // quantidade em estoque
 
    // Método que usa os atributos para calcular o valor total em estoque
    double valorTotalEstoque() {
        // preco e quantidade são atributos: qualquer método do objeto pode usar eles
        return preco * quantidade;
    }
}
 
public class Main {
    public static void main(String[] args) {
        // Primeiro objeto e atribuindo valores aos atributos
        Produto p1 = new Produto();
        p1.codigo = 101;
        p1.nome = "Mouse";
        p1.preco = 49.90;
        p1.quantidade = 10;
 
        // Segundo objeto
        Produto p2 = new Produto();
        p2.codigo = 102;
        p2.nome = "Teclado";
        p2.preco = 120.00;
        p2.quantidade = 5;
 
        // Valores guardados em cada objeto
        System.out.println("Codigo: " + p1.codigo + " | Nome: " + p1.nome + " | Preco: " + p1.preco);
        System.out.println("Qtd: " + p1.quantidade + " | Total em estoque: " + p1.valorTotalEstoque());
        System.out.println("Codigo: " + p2.codigo + " | Nome: " + p2.nome + " | Preco: " + p2.preco);
        System.out.println("Qtd: " + p2.quantidade + " | Total em estoque: " + p2.valorTotalEstoque());
    }
}

