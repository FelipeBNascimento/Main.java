package operacao;
import Contas.Conta;
import java.util.Scanner;


public class Operacoes{

    Scanner scanner = new Scanner(System.in);

    public void depositarValor(Conta conta) {

        System.out.println("Informa o valor para depósito: ");
        double valor = scanner.nextDouble();

        conta.setSaldo(conta.getSaldo() + valor);

    }

    public void sacarValor(Conta conta){

        System.out.println("Informa o valor para sacar: ");
        double valor = scanner.nextDouble();

        if(conta.getSaldo() > valor) {
            conta.setSaldo(conta.getSaldo() - valor);
        }else{
            System.out.println("Saldo indísponível");
        }

    }

    public void transferirValor(Conta containicial, Conta contaFinal){

        sacarValor(containicial);
        depositarValor(contaFinal);

    }
}
