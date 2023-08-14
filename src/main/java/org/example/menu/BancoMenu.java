package org.example.menu;

import org.example.model.Titular;
import org.example.service.BancoService;

import java.util.Scanner;

public class BancoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco!");
        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Titular titular = new Titular(nome, agencia, conta, saldoInicial);
        BancoService bancoService = new BancoService();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    bancoService.sacar(titular, valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    bancoService.depositar(titular, valorDeposito);
                    break;
                case 3:
                    bancoService.consultarSaldo(titular);
                    break;
                case 4:
                    System.out.println("Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
