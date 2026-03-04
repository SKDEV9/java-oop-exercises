package gestaodeassinaturas;
import java.math.BigDecimal;

public class Fatura {

    private static final int MESES_PARA_DESCONTO = 12;
    private static final BigDecimal PERCENTUAL_DE_DESCONTO = new BigDecimal("0.10");
    private Assinatura assinatura;
    private int meses;
    private BigDecimal valorFinal;


    public Fatura(Assinatura assinatura, int meses) {
        this.assinatura = assinatura;
        this.meses = meses;
    }

    public void calcularValorFinal() {
        BigDecimal valor = assinatura.getValor();

        // Formula base para calculo do valor final
        BigDecimal total = valor.multiply(BigDecimal.valueOf(meses));

        this.valorFinal = total;

        if (meses >= MESES_PARA_DESCONTO) {
            this.valorFinal = total.subtract(total.multiply(PERCENTUAL_DE_DESCONTO));
        }
    }


    public BigDecimal getValorFinal() {
        return this.valorFinal;
    }
}
