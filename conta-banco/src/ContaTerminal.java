import java.util.Scanner;
import java.util.Locale;

/**
 * <h1>Conta Banco</h1>
 * O projeto Conta Banco foi criado para exercitar todo o conteúdo apresentado 
 * no módulo de Sintaxe codificando o cenário de abertura de uma conta no banco.
 * 
 * <P>
 * <b>Inputs:</b>
 * - Número de Usuário
 * - Número da Agência
 * - Nome Completo do Cliente
 * - Saldo da Contar
 * 
 * <b>Outputs:</b> É apresentado um texto com as informações inseridas pelo usuário.
 * 
 * @author Maicon Farias
 * @version 1.0
 * @since 15/08/2023
*/

public class ContaTerminal {

        /** 
         * As declarações seguintes foram necessárias para o programa não pular linhas:
         * 
         * @param numeroUsuario recebe input em String e converte para Integer
         * @param saldoConta recebe input em String e converte para Double 
         * 
         */

    public static void main (String[] args) throws Exception {
        

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        //Input Número do Usuário
        System.out.println("Digite seu número de usuário:");
        int numeroUsuario = Integer.parseInt(entrada.nextLine());
        
        //Input Número da Agência do Cliente
        System.out.println("Digite seu número de agência:");
        String agenciaCliente = entrada.nextLine();

        //Input Nome Completo do Cliente
        System.out.println("Digite seu nome:");
        String nomeCompleto = entrada.nextLine();

        //Input Saldo da Conta do Cliente
        System.out.println("Digite o seu saldo:");
        double saldoConta = Double.parseDouble(entrada.next()); 

        entrada.close(); //Fecha teclado

        System.out.println(); //Apenas para separar a informação no terminal

        System.out.printf("Olá " + nomeCompleto + ", \nObrigado por criar uma conta em nosso banco. \nSua agência é " 
        + agenciaCliente + ", Conta " + numeroUsuario + " e seu saldo " + saldoConta + " EUR já está disponível para saque.");

        
    }
}
