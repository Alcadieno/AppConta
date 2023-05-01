public class Conta {
    private String nomeCliente;
    private int idConta;
    private double saldo;
    private double limite;

    public Conta(String nomeCliente, int idConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.idConta = idConta;
        this.saldo = saldo;
        this.limite = 940.00;

    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void sacar(double valorSacado) throws ExcecaoSaldo {
        if (saldo < valorSacado) {
            throw new ExcecaoSaldo("Saldo Insuficiente para realizar o saque");
        }
        saldo -= valorSacado;
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

}