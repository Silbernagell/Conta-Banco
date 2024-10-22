import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("por favor digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de $" + saldo + " já está disponível para saque.");


    }
}
