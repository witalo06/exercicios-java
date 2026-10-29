package Conta;

public class Conta {
	protected double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void atualiza(double taxa) {
        this.saldo = this.saldo + (this.saldo * taxa);
    }

}
