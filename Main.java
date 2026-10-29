package Conta;

public class Main { 
	
 public static void main(String[] args) {
    Conta conta = new Conta();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    conta.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);

    conta.atualiza(0.10);
    cc.atualiza(0.10);
    cc.atualiza(0.10);
    cp.atualiza(0.10);

    System.out.println("Conta Simples: R$ " + conta.getSaldo());
    System.out.println("Conta Corrente: R$ " + cc.getSaldo());
    System.out.println("Conta Poupança: R$ " + cp.getSaldo());
    }

}
