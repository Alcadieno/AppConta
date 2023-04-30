public class AppConta extends Conta{
    public AppConta(String nomeClient, int idConta, double saldo) {
        super(nomeClient,idConta,saldo);

    } //Chamando o construtor da Classe conta para a clase ApConta

    public void getinfo (AppConta Conta){
        System.out.println("--------");
        System.out.println("Nome do Cliente :"+ NomeClient );
        System.out.printf("O Seu saldo eh:" + saldo );
        System.out.println("");
        System.out.println("--------");

    } //Metodo Getinfo retorna as informações do cliente utilizando uma instancia da Classe como parametro

    @Override
    public void depositar(double ValorDepositado) {
        super.depositar(ValorDepositado);
    }
    //Sobrescreve o metodo
    @Override
    public void sacar(double valorSacado) {

        super.sacar(valorSacado);
        System.out.print("Seu saldo eh:" + saldo);
        System.out.println("");
        System.out.println("--------");
    } // Metodo retorna  o valor apos a operação de saque
}
