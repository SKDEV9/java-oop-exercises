package streamtransacoes;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ServicoConciliacao {

    public Map<String, BigDecimal> sumarizarPixAprovadosPorConta(List<Transacao> transacoes) {

        return transacoes.stream()
                .filter(transacao -> transacao.tipo() == TipoTransacao.PIX)
                .filter(transacao -> transacao.status() == StatusTransacao.APROVADA)
                .collect(Collectors.groupingBy(Transacao::contaOrigem , Collectors.reducing(BigDecimal.ZERO, Transacao::valor, BigDecimal::add )));
    }
}
