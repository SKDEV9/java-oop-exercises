package miniprojetotransacoes;
import java.math.BigDecimal;
import java.util.List;

public class ConciliadorPagamentos {

    public static void main(String[] args) {

        List<String> linhasDoArquivo = List.of(
                "PIX;email@cliente.com;100.00",
                "CARTAO;1234-5678;200.00",
                "BOLETO;9999999;50.00",      // ERRO: Não suportamos boleto ainda!
                "PIX;telefone-11;cinquenta", // ERRO: Formato de número inválido!
                "CARTAO;0000-0000;150.00"
        );

        BigDecimal totalProcessadoComSucesso = new BigDecimal("0.0");

        for (String linha : linhasDoArquivo) {

            try {
                String[] colunas = linha.split(";");

                String tipo = colunas[0];
                String id = (colunas[1]);
                BigDecimal valor = new BigDecimal(colunas[2]);

                if (tipo.equals("PIX")) {
                    Pix novoPix = new Pix(id);
                    BigDecimal valorTransacaoPix = novoPix.processar(valor);
                    totalProcessadoComSucesso = totalProcessadoComSucesso.add(valorTransacaoPix);


                } else if (tipo.equals("CARTAO")) {
                    CartaoCredito novoCartao = new CartaoCredito(id);
                    BigDecimal valorTransacaoCartao = novoCartao.processar(valor);
                    totalProcessadoComSucesso = totalProcessadoComSucesso.add(valorTransacaoCartao);

                } else {
                    throw new IllegalArgumentException("Tipo de pagamento desconhecido.");
                }

            } catch (Exception e) {
                System.out.printf("\nFalha ao processar a linha [ %s ] -> Motivo: %s", linha, e.getMessage());
            }

        }

        System.out.printf("\n\nFechamento de Lote. Total processado com sucesso: R$ %.2f\n", totalProcessadoComSucesso
        );

    }
}
