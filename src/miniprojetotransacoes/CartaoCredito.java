package miniprojetotransacoes;
import java.math.BigDecimal;

public class CartaoCredito extends MetodoPagamento {

    private static final BigDecimal VALOR_DA_TAXA = new BigDecimal("0.03");


    public CartaoCredito(String id) {
        super(id);
    }


    @Override
    public BigDecimal processar(BigDecimal valor) {

        BigDecimal calcValorComTaxa = valor.add(valor.multiply(VALOR_DA_TAXA));

        System.out.printf("\nProcessando cartão de crédito [ id: %s ] (sem taxa aplicada) no valor de R$: %.2f", this.id, valor);
        System.out.printf("\nProcessando cartão de crédito [ id: %s ] (com taxa de 3%% aplicada) no valor de R$: %.2f", this.id, calcValorComTaxa);

        return calcValorComTaxa;
    }
}
