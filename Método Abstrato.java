package metodo;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 07 - Metodo Abstrato
 */
 
// Classe abstrata: como tem um método abstrato, ela precisa ser abstract
abstract class Forma {
    // Método abstrato: só a assinatura, sem corpo
    public abstract double calcularArea();
}
// Circulo implementa o método com a fórmula do círculo
class Circulo extends Forma {
    double raio;
    Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;   // área = pi * raio²
    }
}
// Retangulo implementa o mesmo método com outra fórmula
class Retangulo extends Forma {
    double base;
    double altura;
    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;           // área = base * altura
    }
}
public class Main {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Retangulo(4, 6);
        System.out.printf("Area do circulo (raio 5): %.2f%n", f1.calcularArea());
        System.out.printf("Area do retangulo (4 x 6): %.2f%n", f2.calcularArea());
    }
}