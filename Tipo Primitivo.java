package dados;

/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 18 - Tipos de Dados Primitivos
 */
// Classe só com atributos de instância, para mostrar o valor padrão de cada tipo
class ValoresPadrao {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bo;
}
public class Main {
    public static void main(String[] args) {
        // Os oito tipos primitivos, cada um com um exemplo de uso
        byte idadeCurta = 100;               // inteiro de 8 bits
        short ano = 2026;                    // inteiro de 16 bits
        int populacao = 215000000;           // inteiro de 32 bits (o mais usado)
        long distanciaEmMetros = 9460730472580800L;   // inteiro de 64 bits (sufixo L)
        float temperatura = 36.5f;           // decimal de 32 bits (sufixo f)
        double preco = 1999.99;              // decimal de 64 bits (o mais usado)
        char letra = 'J';                    // um único caractere (16 bits)
        boolean aprovado = true;             // verdadeiro ou falso
 
        System.out.println("byte: " + idadeCurta + " (tamanho: " + Byte.SIZE + " bits)");
        System.out.println("short: " + ano + " (tamanho: " + Short.SIZE + " bits)");
        System.out.println("int: " + populacao + " (tamanho: " + Integer.SIZE + " bits)");
        System.out.println("long: " + distanciaEmMetros + " (tamanho: " + Long.SIZE + " bits)");
        System.out.println("float: " + temperatura + " (tamanho: " + Float.SIZE + " bits)");
        System.out.println("double: " + preco + " (tamanho: " + Double.SIZE + " bits)");
        System.out.println("char: " + letra + " (tamanho: " + Character.SIZE + " bits)");
        System.out.println("boolean: " + aprovado + " (tamanho: definido pela JVM)");
        // Valores padrão dos atributos de instância
        ValoresPadrao v = new ValoresPadrao();
        System.out.println("--- Valores padrao (atributos de instancia) ---");
        System.out.println("byte: " + v.b);
        System.out.println("short: " + v.s);
        System.out.println("int: " + v.i);
        System.out.println("long: " + v.l);
        System.out.println("float: " + v.f);
        System.out.println("double: " + v.d);
        System.out.println("char: codigo " + (int) v.c + " (caractere '\\u0000')");
        System.out.println("boolean: " + v.bo);
    }
}
