package Contas;

public class Poupanca extends Conta {


    public Poupanca(String nome){

        super(nome);
    }

    @Override
    public void rendimento() {
        
       setSaldo(getSaldo() * 0.007);
    }

    public double somenteRendimento() {
        double rendimento  = getSaldo() * 0.007;
        return rendimento;
    }

    @Override
    public String nomeDaConta() {
        return "Contas.Conta Poupança";
    }
}



