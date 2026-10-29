package pi;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 19 - Palavra Reservada final
 */
 
public class Main {
    public static void main(String[] args) {
        // Constante: depois de receber o valor, não pode mais ser alterada
        final double PI = 3.14159;
 
        double raio = 5;
        double area = PI * raio * raio;
        System.out.println("PI = " + PI);
        System.out.println("Area do circulo de raio 5 = " + area);
 
        // Descomente a linha abaixo para ver o erro do compilador:
         //PI = 3.14;    ERRO: cannot assign a value to final variable PI
    }
}

