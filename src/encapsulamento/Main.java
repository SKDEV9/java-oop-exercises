package encapsulamento;

public class Main {
    public static void main(String[] args) {

        ContaBancaria novaConta = new ContaBancaria(100.00);

        novaConta.depositar(20.50);

        System.out.println(novaConta.getSaldo());
    }
}
