package inter;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 12 - Interfaces
 */
// Interface: define O QUE deve ser feito, sem dizer COMO
interface Pagamento {
    void pagar();
}
// Pix implementa a interface e define seu próprio jeito de pagar
class Pix implements Pagamento {
    double valor;
 
    Pix(double valor) {
        this.valor = valor;
    }
    @Override
    public void pagar() {   // métodos de interface são públicos
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}
// Cartao também implementa a interface, de outra forma
class Cartao implements Pagamento {
    double valor;
    int parcelas;
    Cartao(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
    }
    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " no cartao em " + parcelas + "x.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Podemos usar o tipo da interface como referência
        Pagamento p1 = new Pix(150.00);
        Pagamento p2 = new Cartao(300.00, 3);
        p1.pagar();
        p2.pagar();
    }
}