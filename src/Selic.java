
public class Selic extends Conta {


    public Selic(String nome){

        super(nome);
    }

    public double somenteRendimento() {
        double rendimento  = getSaldo() * 0.010;
        return rendimento;
    }


    @Override
    public double rendimento() {
        this.saldo = getSaldo() + (getSaldo() * 0.010);
        return this.saldo;
    }

    @Override
    public String nomeDaConta() {
        return "Conta Selic";
    }
}
