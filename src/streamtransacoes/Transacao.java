package streamtransacoes;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

 enum TipoTransacao { PIX, TED, DOC, CARTAO_CREDITO }
 enum StatusTransacao { APROVADA, NEGADA, ESTORNADA }


public record Transacao(
        String id,
        String contaOrigem,
        BigDecimal valor,
        TipoTransacao tipo,
        StatusTransacao status
){}