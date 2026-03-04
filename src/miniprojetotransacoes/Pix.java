package miniprojetotransacoes;
import java.math.BigDecimal;

public class Pix extends MetodoPagamento {

    private static final BigDecimal VALOR_DO_DESCONTO = new BigDecimal("0.015");


    public Pix(String id) {
        super(id);
    }


    @Override
    public BigDecimal processar(BigDecimal valor) {

        BigDecimal valorFinalComDesconto = valor.subtract(valor.multiply(VALOR_DO_DESCONTO));

        System.out.printf("\nProcessando PIX [ id: %s ] (sem desconto aplicado) no valor de R$: %.2f", this.id, valor);
        System.out.printf("\nProcessando PIX [ id: %s ] (com desconto aplicado) no valor de R$: %.2f", this.id, valorFinalComDesconto);

        return valorFinalComDesconto;
    }
}
