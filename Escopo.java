package escop;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 14 - Escopo
 */
class Escopo {
    static int objetosCriados = 0;   // variável ESTÁTICA: existe uma só, pertence à classe
    int atributo;                    // atributo de INSTÂNCIA: cada objeto tem o seu
    Escopo(int atributo) {
        this.atributo = atributo;
        objetosCriados++;
    }
    // "parametro" é um parâmetro: só existe dentro deste método
    void demonstrar(int parametro) {
        int local = parametro * 2;   // variável LOCAL: só existe dentro deste método
        System.out.println("Parametro: " + parametro);
        System.out.println("Local: " + local);
        // o atributo é acessível em qualquer método do objeto
        System.out.println("Atributo do objeto: " + atributo);
        // a estática é acessível por todos
        System.out.println("Estatica da classe: " + objetosCriados);
    }
    // Mostra o que acontece quando a variável local tem o mesmo nome do atributo
    void sombra() {
        int atributo = 99;   // esta local "esconde" o atributo dentro do método
        System.out.println("Local (atributo): " + atributo);
        System.out.println("Atributo do objeto (this.atributo): " + this.atributo);
    }
}
public class Main {
    public static void main(String[] args) {
        Escopo e1 = new Escopo(10);
        Escopo e2 = new Escopo(20);
        e1.demonstrar(5);
        System.out.println("---");
        e2.demonstrar(7);
        System.out.println("---");
        e1.sombra();
        // System.out.println(local);       // ERRO: "local" só existe dentro de demonstrar()
        // System.out.println(parametro);   // ERRO: "parametro" só existe dentro do método
        System.out.println("---");
        System.out.println("Total de objetos (variavel estatica): " + Escopo.objetosCriados);
    }
}