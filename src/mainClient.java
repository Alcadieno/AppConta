public class mainClient {
    public static void main(String[] args) throws ExcecaoSaldo {
    AppConta Cliente1 = new AppConta("Fernando",001,2000);
    AppConta Cliente2 = new AppConta("Gabriela",002,3000);
    AppConta Cliente3 = new AppConta("Jose",003,1500);
    Cliente1.printInfo();
    Cliente2.printInfo();
    Cliente1.transferenciaPix(Cliente2,1500);

    Cliente1.printInfo();
    Cliente2.printInfo();
    }
}