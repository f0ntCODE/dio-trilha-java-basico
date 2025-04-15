/** @Autor: Leonardo Fontanive Tonet
 * 
 *AFAZERES:
 * Criar interface de apresentação;
 * Criar métodos de obtenção de dados de registro;
 * Instanciar a classe Scanner
 * Exibir as mensagens ao usuário
 */

 import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //VARs
        int numeroConta    = 0;
        String agencia     = "";
        String nomeCliente = ""; 
        double saldo       = 0.0;

        Scanner scan       = new Scanner(System.in);

        //**Interface**

        System.out.println("\t|***********|");        
        System.out.println("\t|***Banco***|");
        System.out.println("\t|***********|");

        System.out.println("Digite seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o número de sua agência: ");
        agencia = scan.nextLine();

        System.out.println("Digite o número de sua conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Digite o seu saldo");
        saldo = scan.nextDouble();

        System.out.println("Carregando...");
        
        scan.close();

        Thread.sleep(2500); //cria uma pausa em milisegundos nas threads. Criada para fins decorativos

        System.out.printf("\nOlá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta número %d e saldo de %.2f já disponível para saque!", nomeCliente, agencia, numeroConta, saldo);


    }
}
