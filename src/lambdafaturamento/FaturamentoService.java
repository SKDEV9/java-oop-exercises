package lambdafaturamento;

import java.math.BigDecimal;
import java.util.List;

public class FaturamentoService {

    public BigDecimal calcularReceitaTotal(List<Transacao> transacoes) {

        return transacoes.stream()
                .filter(transacao -> "APROVADA" .equals(transacao.status()))
                .map(Transacao::valor).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
