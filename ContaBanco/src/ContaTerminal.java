import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Todo: Conhecer e importar a classe Scanner
        // Exibir as mensagens para nossos usuarios
        // Obter pela classe Scaner os valores digitados no terminal
        // Exibir a mensagem conta criada. 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite os dados solicitados a seguir para criar sua conta.");
        System.out.println();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor depositado na conta: ");
        double saldo = scanner.nextDouble();
        System.out.println();


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + 
                            " e seu saldo " + saldo +  " já está disponível para saque.");
        

    }
    }
