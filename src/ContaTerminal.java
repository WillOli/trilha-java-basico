import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao Banco");


        System.out.print("Digite o número da agencia: ");
        numero = input.nextInt();


        System.out.print("Por favor, digite o número da agência: ");
        agencia = input.next();

        System.out.print("Digite o nome seu nome: ");
        input.nextLine();
        nomeCliente = input.nextLine();


        System.out.print("Digite o saldo da conta: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia +
                ", conta " + numero + " seu saldo " + saldo + " já está disponível.");
    }
}