
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        System.out.println( "Por favor, digite o número da Agencia !");
        String agencia = scanner.next();
        System.out.println("Por favor, Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, Digite seu Sobrenome: ");
        String sobreNomeCliente = scanner.next();

        System.out.println("Por favor, Digite seu saldo");
        double saldoCliente = scanner.nextDouble();

        //imprimir dados coletados
        System.out.println("------------------------------------------");
        System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente );
        System.out.println("Obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é "+ agencia +" Conta " +numero);
        System.out.println("e seu saldo "  + saldoCliente + " e seu saldo já está disponivel para saque.");
        System.out.println("------------------------------------------");






  
  
    }
    
}