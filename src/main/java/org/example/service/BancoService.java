package org.example.service;

import org.example.model.Titular;

public class BancoService {

    public void sacar(Titular titular, double valor) {
        if (valor > 0 && valor <= titular.getSaldo()) {
            titular.setSaldo(titular.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + titular.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(Titular titular, double valor) {
        if (valor > 0) {
            titular.setSaldo(titular.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + titular.getSaldo());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void consultarSaldo(Titular titular) {
        System.out.println("Saldo atual: " + titular.getSaldo());
    }
}
