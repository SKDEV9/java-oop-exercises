package streamecommerce;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerceiroNivel {

    public List<Produto> todosOsPedidos(List<Pedido> pedidos) {

        return pedidos.stream()
                .flatMap(pedido -> pedido.produto().stream())
                .distinct()
                .toList();
    }

    public Map<CategoriaProduto, List<Produto>> agrupandoCategorias(List<Produto> produtos) {

        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::categoria));
    }
}
