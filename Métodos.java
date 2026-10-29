package calcular;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 06 - Metodos
 */
class Calculadora {
    // Métodos que RETORNAM valor: devolvem o resultado para quem chamou
    double somar(double a, double b) {
        return a + b;
    }
    double subtrair(double a, double b) {
        return a - b;
    }
    double multiplicar(double a, double b) {
        return a * b;
    }
    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: nao existe divisao por zero.");
            return 0;
        }
        return a / b;
    }
    // Método void: NÃO devolve nada, só executa uma ação (mostrar na tela)
    void mostrarResultado(String operacao, double resultado) {
        System.out.println(operacao + " = " + resultado);
    }
}
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        // Guardamos o valor retornado em variáveis
        double soma = calc.somar(10, 5);
        double subtracao = calc.subtrair(10, 5);
        double multiplicacao = calc.multiplicar(10, 5);
        double divisao = calc.dividir(10, 5);
        // Método void: só chamamos, não há valor para guardar
        calc.mostrarResultado("10 + 5", soma);
        calc.mostrarResultado("10 - 5", subtracao);
        calc.mostrarResultado("10 * 5", multiplicacao);
        calc.mostrarResultado("10 / 5", divisao); 
        // Testando a divisão por zero
        calc.dividir(10, 0);
    }
}