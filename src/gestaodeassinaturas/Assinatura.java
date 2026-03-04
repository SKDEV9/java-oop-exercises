package gestaodeassinaturas;
import java.math.BigDecimal;


public class Assinatura {

    private String id;
    private String plano;
    private BigDecimal valor;
    private boolean ativa = true;


    public Assinatura(String id, String plano, BigDecimal valor) {
        this.id = id;
        this.plano = plano;
        this.valor = valor;
    }

    public void cancelar() {
        ativa = false;
    }

    public void Ativar() {   // Convenção is para booleans
        ativa = true;
    }

    public String getPlano() {
        return this.plano;
    }

    public String getId() {
        return this.id;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

}
