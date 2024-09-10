
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saudações! Você já tem uma conta? Digite 1 para 'Sim' e 2 para 'Não':");
        System.out.println("1.");
        System.out.println("2.");

        char opcao = scanner.next().charAt(0);

        int numeroConta;

        switch (opcao) {
            case '1': 
            System.out.println("Digite o número da sua conta: ");
            numeroConta = scanner.nextInt();
                break;
            case '2':
            System.out.println("Digite o número da sua nova conta: ");
            numeroConta = scanner.nextInt();
                break;

            default:
            System.out.println("Operação inválida.");
                return;
        }   

        scanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.nextLine().trim();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Qual é o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
        "conta %d e seu saldo R$%.2f já está disponível para saque.%n", nome, agencia, numeroConta, saldo);
    }
}
