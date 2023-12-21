import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seus dados");
        System.out.println("NOME: ");
        String nome = leitor.nextLine();
        System.out.println("TIPO DA CONTA: ");
        String tipoConta = leitor.nextLine();
        System.out.println("SALDO DA CONTA: ");
        int saldoConta = leitor.nextInt();

        System.out.println("***********************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + saldoConta);
        System.out.println("*********************** ");

        int opcao = 0;
        while (opcao != 4){
            System.out.println("******* MENU *******");
            System.out.println("1- CONSULTAR VALOR");
            System.out.println("2- TRANSFERIR");
            System.out.println("3- DEPOSITAR");
            System.out.println("4- SAIR");
            opcao = leitor.nextInt();

            if(opcao == 1){
                System.out.println("VALOR ATUAL DA CONTA: " + saldoConta);
            } else if(opcao == 2) {
                System.out.println("INFORME O VALOR QUE DESEJA TRANSFERIR: ");
                double valor = leitor.nextDouble();
                if(valor > saldoConta){
                    System.out.println("SALDO INSUFICIENTE");
                }else{
                    saldoConta -= valor;
                    System.out.println("TRANSFERÊNCIA CONCLUIDA. NOVO SALDO: " + saldoConta);
                }
            }else if(opcao == 3){
                System.out.println("INFORME O VALOR QUE DESEJA DEPOSITAR: ");
                int valor = leitor.nextInt();
                saldoConta += valor;
                System.out.println(saldoConta);

            }else if(opcao != 4) {
                System.out.println("OPÇÃO INVÁLIDA");
            }
        }
        System.out.println("PROGRAMA ENCERRADO");
    }
}

