package JAVABOSTA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc = null;
        ContaPoupanca cp = null;

        System.out.println("Bem-vindo ao sistema bancário!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Abrir conta corrente");
            System.out.println("2. Abrir conta poupança");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar saque");
            System.out.println("5. Exibir saldo");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cc = abrirContaCorrente(scanner);
                    break;
                case 2:
                    cp = abrirContaPoupanca(scanner);
                    break;
                case 3:
                    realizarDeposito(cc, cp, scanner);
                    break;
                case 4:
                    realizarSaque(cc, cp, scanner);
                    break;
                case 5:
                    exibirSaldo(cc, cp);
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar nosso sistema bancário. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static ContaCorrente abrirContaCorrente(Scanner scanner) {
        System.out.println("Digite o número da conta corrente:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo inicial da conta corrente:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o titular da conta corrente:");
        String titular = scanner.next();
        return new ContaCorrente(numeroConta, saldo, titular);
    }

    private static ContaPoupanca abrirContaPoupanca(Scanner scanner) {
        System.out.println("Digite o número da conta poupança:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo inicial da conta poupança:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o titular da conta poupança:");
        String titular = scanner.next();
        return new ContaPoupanca(numeroConta, saldo, titular);
    }

    private static void realizarDeposito(ContaCorrente cc, ContaPoupanca cp, Scanner scanner) {
        System.out.println("Digite o valor do depósito:");
        double valor = scanner.nextDouble();
        if (cc != null) {
            cc.depositar(valor);
        } else if (cp != null) {
            cp.depositar(valor);
        } else {
            System.out.println("Nenhuma conta aberta. Por favor, abra uma conta primeiro.");
        }
    }

    private static void realizarSaque(ContaCorrente cc, ContaPoupanca cp, Scanner scanner) {
        System.out.println("Digite o valor do saque:");
        double valor = scanner.nextDouble();
        if (cc != null) {
            cc.sacar(valor);
        } else if (cp != null) {
            cp.sacar(valor);
        } else {
            System.out.println("Nenhuma conta aberta. Por favor, abra uma conta primeiro.");
        }
    }

    private static void exibirSaldo(ContaCorrente cc, ContaPoupanca cp) {
        if (cc != null) {
            System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
        }
        if (cp != null) {
            System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
        }
    }
}
