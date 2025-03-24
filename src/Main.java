import Contas.Poupanca;
import Contas.Selic;
import operacao.Operacoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto para cada classe Contas.Conta corrente, Contas.Conta poupança e Contas.Conta Contas.Selic
       // Conta contaCorrente = new Conta("Felipe Bazan");
        Poupanca contaPoupanca = new Poupanca("Felipe Bazan");
        Selic contaSelic = new Selic("Felipe Bazan");

        Scanner scanner = new Scanner(System.in);

        Operacoes operacoes = new Operacoes();

        contaSelic.mostrarinformacao();
        operacoes.depositarValor(contaSelic);
        contaPoupanca.mostrarinformacao();
        operacoes.transferirValor(contaSelic, contaPoupanca);
        contaSelic.mostrarinformacao();
        contaPoupanca.mostrarinformacao();





        /*System.out.println("Digite 1 para entrar ou 2 para Sair");
        int entraNoMenu = scanner.nextInt();

        if (entraNoMenu == 1) {
            while (true) {

                System.out.println("Qual conta deseja entrar\n" +
                        "1. Contas.Conta corrente\n" +
                        "2. Contas.Conta Poupança\n" +
                        "3. Contas.Conta Contas.Selic\n" +
                        "4. Para sair");
                int entraMenuNasContas = scanner.nextInt();

                if (entraMenuNasContas == 1) {
                    System.out.println("Digite\n 1. Para saldo\n 2. Para depositar\n 3. Para sacar \n 4. Transferir ");
                    int entraMenuContaConrrente = scanner.nextInt();
                    if (entraMenuContaConrrente == 1) {
                        contaCorrente.mostrarinformacao();
                    } else if (entraMenuContaConrrente == 2) {
                        System.out.println("Informe o valor que deseja depositar: ");
                        double valorParaDepositar = scanner.nextDouble();
                        contaCorrente.depositarValor(valorParaDepositar);
                    } else if (entraMenuContaConrrente == 3) {
                        System.out.println("Informe o valor que deseja sacar: ");
                        double valorparaSacar = scanner.nextDouble();
                        contaCorrente.sacarValor(valorparaSacar);
                    }else if(entraMenuContaConrrente ==4) {

                        System.out.println("Informe o valor que deseja Transferir para conta poupança");
                        double valor = scanner.nextDouble();
                        contaCorrente.transferirValor(valor, contaPoupanca);

                    }else {
                        System.out.println("Saindo");
                    }
                }else if (entraMenuNasContas == 2) {
                     System.out.println("Digite\n 1. Para saldo\n 2. Para depositar\n 3. Para sacar\n 4. Para ver rendimento \n 5. Para transferir");
                     int entraMenuContaPoupanca = scanner.nextInt();
                     if (entraMenuContaPoupanca == 1){
                         System.out.println("Saldo atualizado: "+ contaPoupanca.rendimento());
                     }else if (entraMenuContaPoupanca == 2){
                         System.out.println("Informe o valor para depositar: ");
                         double valorParaDepositar = scanner.nextDouble();
                         contaPoupanca.depositarValor(valorParaDepositar);
                     }else if (entraMenuContaPoupanca == 3){
                         System.out.println("Informe valor para sacar: ");
                         double valorParaSacar = scanner.nextDouble();
                         contaPoupanca.sacarValor(valorParaSacar);
                     }else if (entraMenuContaPoupanca==4){
                         System.out.println("O rendimento foi  de: "+ contaPoupanca.somenteRendimento());
                     }else if (entraMenuContaPoupanca ==5){

                         System.out.println("Informe o valor a transferir para conta corrente");
                         double valor = scanner.nextDouble();
                         contaPoupanca.transferirValor(valor, contaCorrente);

                     }else{
                         System.out.println(("Saindo"));
                     }

                } else if (entraMenuNasContas == 3) {
                    System.out.println("Digite\n 1. Para Saldo\n 2. Para Aplicar.\n 3. Para Retirar.\n 4. Para ver rendimento.\n 5. Para sair");
                    int entraMenucontaSelic = scanner.nextInt();
                    if(entraMenucontaSelic ==1){
                        System.out.println("Saldo atualizado: "+ contaSelic.rendimento());
                    }else if(entraMenucontaSelic == 2){
                        System.out.println("Informe o valor para aplicar: ");
                        double valorParaAplicar = scanner.nextDouble();
                        contaSelic.depositarValor(valorParaAplicar);
                    }else if(entraMenucontaSelic == 3){
                        System.out.println("Informe o valor para resgatar: ");
                        double valorParaResgatar = scanner.nextDouble();
                        contaSelic.sacarValor(valorParaResgatar);
                    }else if (entraMenucontaSelic == 4){
                        System.out.println("Seu rendimento foi de " + contaSelic.somenteRendimento());
                    }else{
                        System.out.println("Saindo");
                    }
                } else if (entraMenuNasContas == 4 ) {
                    System.out.println("Saindo");
                    break;
                }
            }
        }else if(entraNoMenu == 2){
            System.out.println("Saindo");

            }else{
            System.out.println("Valor inválido");
        }

        ArrayList listaDeContas = new ArrayList();

        listaDeContas.add(contaSelic);
        listaDeContas.add(contaPoupanca);
        listaDeContas.add(contaCorrente);
        System.out.println(listaDeContas);

        EscreverArquivo novoArquivo = new EscreverArquivo();
        novoArquivo.escreverContas(listaDeContas);*/



    }// Fechando o public statc void main
}// Fechando a classe main