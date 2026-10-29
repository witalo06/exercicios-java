package conta;
/*
 * Nome: Misael Witalo Ferreira da Silva
 * RA: 0025369
 * Atividade 08 - Encapsulamento
 */
class ContaBancaria {
    // Atributos privados: só podem ser acessados dentro da própria classe
    private String titular;
    private double saldo;
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    // Getter: permite CONSULTAR o saldo 
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    // Setter com validação: só aceita nome preenchido
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }
    // Depositar: só aceita valor positivo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
 
    // Sacar: valor positivo e não pode passar do saldo
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        }
    }
}
 
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Joao", 1000);
        // conta.saldo = 999999;   // ERRO: saldo é private
 
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
 
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(5000);      // tentativa inválida
        conta.depositar(-50);   // tentativa inválida
 
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
