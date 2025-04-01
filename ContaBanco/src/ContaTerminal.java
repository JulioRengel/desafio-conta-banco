import java.util.Locale;
import java.util.Scanner;

    /**
* <h1>ContaTerminal</h1>
* ContaTerminal é um sistema que simula a criação de uma conta bancária, solicitando dados básicos do usuário via terminal e exibindo uma mensagem personalizada com as informações inseridas.
* <p>
* <b>Autor: </b> 
*
* @author Julio Rengel
* @version 1.0
* @since   01/04/2025
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

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
