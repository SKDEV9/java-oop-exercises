package polimorfismo;

public class PagamentoCartao extends Pagamento {

    @Override
    public void processar() {
        System.out.println("\nValidando limite e processando cartão de crédito...");
    }
}

