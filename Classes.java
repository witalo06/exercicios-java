package classe;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 03 - Classes
 */
// Classe Carro: três atributos e métodos que representam o que o carro faz
class Carro {
    String marca;
    String modelo;
    int velocidade;   // velocidade atual em km/h
    // Método 1: aumenta a velocidade do carro
    void acelerar(int valor) {
        velocidade = velocidade + valor;
    }
    // Método 2: diminui a velocidade, sem deixar ficar negativa
    void frear(int valor) {
        velocidade = velocidade - valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    // Método extra: mostra o estado atual do carro
    void exibirStatus() {
        System.out.println(marca + " " + modelo + " a " + velocidade + " km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Argo";
        carro.velocidade = 0;
        carro.exibirStatus();   // parado
        carro.acelerar(60);     // chama o método acelerar
        carro.exibirStatus();
        carro.frear(80);        // tenta frear mais do que a velocidade atual
        carro.exibirStatus();   // a velocidade para em 0
    }
}