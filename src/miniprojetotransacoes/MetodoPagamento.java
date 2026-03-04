package miniprojetotransacoes;
import java.math.BigDecimal;

public abstract class MetodoPagamento {

    protected String id;

    public MetodoPagamento(String id) {
        this.id = id;
    }

    public abstract BigDecimal processar(BigDecimal valor);
}
