public class AppConta extends Conta {

    public AppConta(String nomeCliente, int idConta, double saldo) {
        super(nomeCliente, idConta, saldo);
    }

    public void printInfo() {
        System.out.println("--------");
        System.out.println("Nome do Cliente: " + getNomeCliente());
        System.out.printf("O seu saldo é: %.2f\n", getSaldo());
        System.out.printf("O seu limite de crédito é: %.2f\n", getLimite());
        System.out.println("--------");
    }

    @Override
    public void depositar(double valorDepositado) {
        super.depositar(valorDepositado);


    }

    @Override
    public void sacar(double valorSacado) throws ExcecaoSaldo {
        super.sacar(valorSacado);
        System.out.println("--------");

    }

    public void transferenciaPix(AppConta conta, double valorTransferido) throws ExcecaoSaldo {
        if (this.getIdConta() == conta.getIdConta()) {
            throw new IllegalArgumentException("ERRO NA TRANSFERENCIA!!! CONTAS IDENTICAS!!");
        }
        if (valorTransferido > getSaldo()) {
            throw new ExcecaoSaldo("SALDO INSUFICIENTE !!");
        } else if (valorTransferido <= getSaldo()) {
            diminuir(valorTransferido);
            conta.aumentar(valorTransferido);
            System.out.printf("Você recebeu um PIX no Valor de: %.2f\n ",valorTransferido);
            System.out.println("De " + getNomeCliente()+"!!!");
            numPix++;
        }
    }
    public int numerodetrasacoesfeitas(){
        return numDepositos+numSaques+numPix;
    }
}