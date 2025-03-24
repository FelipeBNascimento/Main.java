package Contas;

public class Selic extends Conta {


    public Selic(String nome){

        super(nome);
    }

    public double somenteRendimento() {
       double rendimento  = getSaldo() * 0.010;
        return rendimento;
    }


    @Override
    public void rendimento() {

        setSaldo(getSaldo() * 0.007);

    }

    @Override
    public String nomeDaConta() {
        return "Contas.Conta Contas.Selic";
    }
}
