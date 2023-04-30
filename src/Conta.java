public class Conta {
    protected String NomeClient ;
    protected int idConta;
    protected double saldo;
    protected double limite;

    public Conta (String nomeClient,int idConta, double saldo){
        this.NomeClient = nomeClient;
        this.idConta = idConta;
        this.saldo = saldo;
        this.limite =  940.00;
    } // Os Construtores são inicializados recebendo os parametros Nome,id,Saldo

    public void  depositar (double ValorDepositado){
        saldo +=ValorDepositado;

    } // Metodo Depositar Soma o valoDepositado ao Atributo Saldo
    public void sacar ( double valorSacado){
        if(saldo < valorSacado){// verifica se o valorsacado e maior que o saldo da conta
            System.out.printf("Saldo Insuficiente para realizar o saque");
            System.out.println("");
        } else if (saldo >= valorSacado) {
            saldo -= valorSacado;

        }// Metodo Sacar subtrai o valorSacado do atributo Saldo


    }

}
