package miniprojetotransacoes;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class ProcessadorPagamentos {

    private List<MetodoPagamento> metodosDePagamento = new ArrayList<>();


    public void adicionarMetodo(MetodoPagamento metodo) {
        metodosDePagamento.add(metodo);
    }


    public BigDecimal executarLote(BigDecimal valorPadrao) {

        BigDecimal valorTotalLote = new BigDecimal("0.0");


        for (MetodoPagamento transacao : metodosDePagamento) {

            BigDecimal valorTransacao = transacao.processar(valorPadrao);
            valorTotalLote = valorTotalLote.add(valorTransacao);
        }

        System.out.printf("Valor total de todas as transações: R$ %.2f", valorTotalLote);

        return valorTotalLote;
    }
}
