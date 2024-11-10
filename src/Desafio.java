import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String tipoConta = "Corrent";
        double saldo= 1000;
        int operacao = 0;

        System.out.print("Digite o nome: ");
        nome = leitura.nextLine();


        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("***********************\n");

        while (operacao != 4) {  // 4 será a opção de encerrar
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Encerrar");
            System.out.print("Operação: ");
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Novo saldo: " + saldo);
                    break;
                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = leitura.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado. Novo saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando operações. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println("***********************\n");
        }

        leitura.close();
    }
}
