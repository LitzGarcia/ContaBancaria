package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", "João", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("54321", "Maria", 2000);
        ContaInvestimento ci = new ContaInvestimento("67890", "Carlos", 5000);
        ContaSalario cs = new ContaSalario("11223", "Ana", 1500, 300);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco("44556", "Lucas", 12000);

        cc.sacar(1300);
        cp.sacar(2500);
        ci.sacar(1000);
        cs.sacar(500);
        ciar.sacar(1500);

        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        ciar.exibirInformacoes();
    }
}
