package parametro;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 15 - Passagem de Parametros
 */
 
// Classe simples usada para mostrar como objetos são passados para métodos
class Caixa {
    int valor;
}
 
public class Main {
    // Parâmetros a e b (int): são as "variáveis" declaradas no método
    public static int somar(int a, int b) {
        return a + b;
    }
 
    // Parâmetros do tipo double
    public static double media(double x, double y) {
        return (x + y) / 2;
    }
 
    // Parâmetro do tipo String
    public static String saudar(String nome) {
        return "Ola, " + nome + "!";
    }
 
    // Recebe uma CÓPIA do valor: alterar aqui não muda a variável original
    public static void tentarAlterar(int numero) {
        numero = 999;
    }
 
    // Recebe uma cópia da REFERÊNCIA: consegue alterar o conteúdo do objeto original
    public static void alterarCaixa(Caixa c) {
        c.valor = 50;
    }
 
    public static void main(String[] args) {
        // Argumentos: são os valores enviados na hora da chamada
        System.out.println("somar(3, 4) = " + somar(3, 4));
        System.out.println("somar(10, -2) = " + somar(10, -2));
        System.out.println("media(7.5, 8.5) = " + media(7.5, 8.5));
        System.out.println("media(6.0, 9.0) = " + media(6.0, 9.0));
        System.out.println(saudar("Silv"));
        System.out.println(saudar("Maria"));
 
        // Passagem por valor com tipo primitivo
        int original = 10;
        tentarAlterar(original);
        System.out.println("Depois de tentarAlterar, original = " + original);   // continua 10
 
        // Passagem de objeto: a referência é copiada, mas aponta para o mesmo objeto
        Caixa caixa = new Caixa();
        caixa.valor = 1;
        alterarCaixa(caixa);
        System.out.println("Depois de alterarCaixa, caixa.valor = " + caixa.valor);   // vira 50
    }
}