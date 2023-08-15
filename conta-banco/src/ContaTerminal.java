import java.util.Scanner;

/**
 * @auto Maicon Farias
 * @version 1.0
 * @since 15/08/2023
*/

public class ContaTerminal {
    
   
    public static void main(String[] args) throws Exception {
        

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu número de usuário:");
        int numeroUsuario = entrada.nextInt();

        System.out.println("Digite seu número de agência:");
        String agenciaCliente = entrada.nextLine();

        System.out.println("Digite seu nome completo:");
        String nomeCliente = entrada.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldoConta = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaCliente + ", conta " + numeroUsuario + " e seu saldo " + saldoConta + "€ já está disponnível para saque.");

        
    }
}
