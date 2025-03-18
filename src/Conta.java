public class Conta {

    private String nome;
    protected double saldo;
    private double depositaValor;
    private double sacaValor;


    public Conta (String nome) {

        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo(){
        return saldo;
    }


    public double getDepositaValor() {
        return depositaValor;
    }

    public void setDepositaValor(double depositaValor) {
        this.depositaValor = depositaValor;
    }

    public double getSacaValor() {
        return sacaValor;
    }

    public void setSacaValor(double sacaValor) {
        this.sacaValor = sacaValor;
    }

    public void depositarValor(double valor){
        saldo += valor;
        System.out.println( "Valor depositado: " + valor + "deu certo valor depositado");

    }

    public void sacarValor(double valor){

        if (valor <= saldo){
            saldo -= valor;

            System.out.println("Saque de " + valor + "\nRealizado com sucesso");

        }else{
            System.out.println("Valor indisponível.");
        }

    }

    public void transferirValor(double valor,  Conta contaFinal){

        this.sacarValor(valor);
        contaFinal.depositarValor(valor);


    }
    public void mostrarinformacao(){

        System.out.println("Nome : " + nome +
                " \nSaldo atual de " + saldo);
    }

    public double rendimento(){

        return saldo;
    }

    public String nomeDaConta(){
        return "Conta Corrente ";
    }

    @Override
    public String toString() {
        return "\n" + nomeDaConta() +  " \nNome: " + getNome() + " \nSaldo atualizado: " + rendimento() + " R$"  ;
    }
}




