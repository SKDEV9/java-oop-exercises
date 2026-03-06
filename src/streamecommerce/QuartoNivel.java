package streamecommerce;

import java.math.BigDecimal;
import java.util.List;

public class QuartoNivel {

    public BigDecimal relatorioVendasVip(List<Pedido> pedidos){

        return pedidos.stream()
                .filter(pedido -> pedido.cliente().idade() < 30)
                .flatMap(pedido -> pedido.produto().stream())
                .filter(produto -> produto.categoria() == CategoriaProduto.ELETRONICO)
                .map(Produto::preco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
