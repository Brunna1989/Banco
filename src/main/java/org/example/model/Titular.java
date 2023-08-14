package org.example.model;

public class Titular {
    private String nome;
    private int agencia;
    private int conta;
    private double saldo;

    public Titular(String nome, int agencia, int conta, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public
    String getNome() {
        return nome;
    }

    public
    void setNome(String nome) {
        this.nome = nome;
    }

    public
    int getAgencia() {
        return agencia;
    }

    public
    void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public
    int getConta() {
        return conta;
    }

    public
    void setConta(int conta) {
        this.conta = conta;
    }

    public
    double getSaldo() {
        return saldo;
    }

    public
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public
    String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
