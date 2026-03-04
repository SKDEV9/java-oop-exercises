package encapsulamento;

public class ContaBancaria {

    // O saldo é privado, ninguem altera de fora
    private double saldo;


    // Criando o construtor da classe contaBancaria
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método controlado para depositar
    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Método para ver o saldo
    public double getSaldo() {
        return this.saldo;
    }
}
