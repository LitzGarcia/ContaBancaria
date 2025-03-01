package org.example;

abstract class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract boolean sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("Conta: " + numeroConta + ", Titular: " + titular + ", Saldo: R$ " + saldo);
    }
}
