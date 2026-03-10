package lambdafaturamento;
import java.math.BigDecimal;


public record Transacao(String status, BigDecimal valor) {}
