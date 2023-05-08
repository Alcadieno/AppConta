import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String nomeCliente;
    private int idConta;
    private double saldo;
    private double limite;
    protected int numDepositos,numSaques,numPix;
    private List<String>historico = new ArrayList<>();

    public Conta(String nomeCliente, int idConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.idConta = idConta;
        this.saldo = saldo;
        this.limite = 940.00;
        numDepositos = 0;
        numPix = 0;
        numSaques =0;

    }
    public void registrarHistorico(String nomeOperacao){
        historico.add(nomeOperacao);
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
        numDepositos++;
    }
    public List<String> getHistorico(){
        return historico;
    }

    public void sacar(double valorSacado) throws ExcecaoSaldo {
        if (saldo < valorSacado) {
            throw new ExcecaoSaldo("Saldo Insuficiente para realizar o saque");
        }
        saldo -= valorSacado;
        numSaques++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }


    public int getIdConta() {
        return idConta;
    }



    public double getSaldo() {
        return saldo;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public int getCountOperacoes(){
        return numDepositos + numSaques + numPix;
    }
    public void aumentar(double valor) {
        saldo += valor;
    }
    public void diminuir(double valor) {
        saldo -= valor;
    }
}