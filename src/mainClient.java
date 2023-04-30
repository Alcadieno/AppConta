public class mainClient {
    public static void main(String[] args) {
        AppConta Cliente1 = new AppConta("Fernando",001,2000.0);
        Cliente1.getinfo(Cliente1);
        Cliente1.sacar(500);
        Cliente1.depositar(1540);
        Cliente1.getinfo(Cliente1);
        Cliente1.sacar(5000);

    }
}
