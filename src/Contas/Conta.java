package Contas;

public class Conta {

    private String nome;
    private double saldo;


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
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarinformacao(){

        System.out.println("Nome : " + nome +
                " \nSaldo atual de " + saldo);
    }

    public void rendimento(){

        System.out.println(getSaldo());

    }

    public String nomeDaConta(){
        return "Contas.Conta Corrente ";
    }

    /*@Override
    public String toString() {
        return "\n" + nomeDaConta() +  " \nNome: " + getNome() + " \nSaldo atualizado: " + rendimento() + " R$"  ;*/
    }
//}




