public class Poupanca extends Conta {


    public Poupanca(String nome){

        super(nome);
    }

    @Override
    public double rendimento() {
        this.saldo = getSaldo() + (getSaldo() * 0.007);
        return getSaldo();
    }

    public double somenteRendimento() {
        double rendimento  = getSaldo() * 0.007;
        return rendimento;
    }

    @Override
    public String nomeDaConta() {
        return "Conta Poupança";
    }
}



