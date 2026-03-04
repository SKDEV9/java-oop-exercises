package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Pagamento novoPagamento = new Pagamento();
        novoPagamento.processar();

        PagamentoCartao novoCartao = new PagamentoCartao();
        novoCartao.processar();
    }
}
